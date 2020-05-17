package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleMap extends js.Object {
  /**
    * Looks up a module by address. Returns null if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def find(address: NativePointerValue): Module | Null = js.native
  /**
    * Just like `find()`, but only returns the `name` field, which means less overhead when you don’t need the
    * other details. Returns null if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def findName(address: NativePointerValue): String | Null = js.native
  /**
    * Just like `find()`, but only returns the `path` field, which means less overhead when you don’t need the
    * other details. Returns null if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def findPath(address: NativePointerValue): String | Null = js.native
  /**
    * Looks up a module by address. Throws an exception if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def get(address: NativePointerValue): Module = js.native
  /**
    * Just like `get()`, but only returns the `name` field, which means less overhead when you don’t need the
    * other details. Throws an exception if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def getName(address: NativePointerValue): String = js.native
  /**
    * Just like `get()`, but only returns the `path` field, which means less overhead when you don’t need the
    * other details. Throws an exception if not found.
    *
    * @param address Address that might belong to a module in the map.
    */
  def getPath(address: NativePointerValue): String = js.native
  /**
    * Determines if `address` belongs to any of the contained modules.
    *
    * @param address Address that might belong to a module in the map.
    */
  def has(address: NativePointerValue): Boolean = js.native
  /**
    * Updates the map.
    *
    * You should call this after a module has been loaded or unloaded to avoid operating on stale data.
    */
  def update(): Unit = js.native
  /**
    * Gets the modules currently in the map. The returned array is a deep copy and will not mutate after a
    * call to `update()`.
    */
  def values(): js.Array[Module] = js.native
}

object ModuleMap {
  @scala.inline
  def apply(
    find: NativePointerValue => Module | Null,
    findName: NativePointerValue => String | Null,
    findPath: NativePointerValue => String | Null,
    get: NativePointerValue => Module,
    getName: NativePointerValue => String,
    getPath: NativePointerValue => String,
    has: NativePointerValue => Boolean,
    update: () => Unit,
    values: () => js.Array[Module]
  ): ModuleMap = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), findName = js.Any.fromFunction1(findName), findPath = js.Any.fromFunction1(findPath), get = js.Any.fromFunction1(get), getName = js.Any.fromFunction1(getName), getPath = js.Any.fromFunction1(getPath), has = js.Any.fromFunction1(has), update = js.Any.fromFunction0(update), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ModuleMap]
  }
  @scala.inline
  implicit class ModuleMapOps[Self <: ModuleMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFind(value: NativePointerValue => Module | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindName(value: NativePointerValue => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindPath(value: NativePointerValue => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: NativePointerValue => Module): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetName(value: NativePointerValue => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPath(value: NativePointerValue => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: NativePointerValue => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[Module]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


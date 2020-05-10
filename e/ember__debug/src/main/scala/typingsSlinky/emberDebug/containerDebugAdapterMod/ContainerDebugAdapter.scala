package typingsSlinky.emberDebug.containerDebugAdapterMod

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerDebugAdapter extends Object {
  var resolver: typingsSlinky.emberEngine.resolverMod.default = js.native
  def canCatalogEntriesByType(`type`: String): Boolean = js.native
  def catalogEntriesByType(`type`: String): js.Array[String] = js.native
}

object ContainerDebugAdapter {
  @scala.inline
  def apply(
    canCatalogEntriesByType: String => Boolean,
    catalogEntriesByType: String => js.Array[String],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    resolver: typingsSlinky.emberEngine.resolverMod.default
  ): ContainerDebugAdapter = {
    val __obj = js.Dynamic.literal(canCatalogEntriesByType = js.Any.fromFunction1(canCatalogEntriesByType), catalogEntriesByType = js.Any.fromFunction1(catalogEntriesByType), constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDebugAdapter]
  }
  @scala.inline
  implicit class ContainerDebugAdapterOps[Self <: ContainerDebugAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanCatalogEntriesByType(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCatalogEntriesByType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCatalogEntriesByType(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogEntriesByType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolver(value: typingsSlinky.emberEngine.resolverMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


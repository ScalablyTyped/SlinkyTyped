package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  /**
    * Base address.
    */
  var base: NativePointer = js.native
  /**
    * Canonical module name.
    */
  var name: String = js.native
  /**
    * Full filesystem path.
    */
  var path: String = js.native
  /**
    * Size in bytes.
    */
  var size: Double = js.native
  /**
    * Enumerates exports of module.
    */
  def enumerateExports(): js.Array[ModuleExportDetails] = js.native
  /**
    * Enumerates imports of module.
    */
  def enumerateImports(): js.Array[ModuleImportDetails] = js.native
  /**
    * Enumerates memory ranges of module with the `name` as seen in `Process#enumerateModules()`.
    *
    * @param protection Minimum protection of ranges to include.
    */
  def enumerateRanges(protection: PageProtection): js.Array[RangeDetails] = js.native
  /**
    * Enumerates symbols of module.
    */
  def enumerateSymbols(): js.Array[ModuleSymbolDetails] = js.native
  /**
    * Looks up the absolute address of the export named `exportName`.
    *
    * Returns null if the export doesn't exist.
    *
    * @param exportName Export name to find the address of.
    */
  def findExportByName(exportName: String): NativePointer | Null = js.native
  /**
    * Looks up the absolute address of the export named `exportName`.
    *
    * Throws an exception if the export doesn't exist.
    *
    * @param exportName Export name to find the address of.
    */
  def getExportByName(exportName: String): NativePointer = js.native
}

object Module {
  @scala.inline
  def apply(
    base: NativePointer,
    enumerateExports: () => js.Array[ModuleExportDetails],
    enumerateImports: () => js.Array[ModuleImportDetails],
    enumerateRanges: PageProtection => js.Array[RangeDetails],
    enumerateSymbols: () => js.Array[ModuleSymbolDetails],
    findExportByName: String => NativePointer | Null,
    getExportByName: String => NativePointer,
    name: String,
    path: String,
    size: Double
  ): Module = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], enumerateExports = js.Any.fromFunction0(enumerateExports), enumerateImports = js.Any.fromFunction0(enumerateImports), enumerateRanges = js.Any.fromFunction1(enumerateRanges), enumerateSymbols = js.Any.fromFunction0(enumerateSymbols), findExportByName = js.Any.fromFunction1(findExportByName), getExportByName = js.Any.fromFunction1(getExportByName), name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnumerateExports(value: () => js.Array[ModuleExportDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerateExports")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnumerateImports(value: () => js.Array[ModuleImportDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerateImports")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnumerateRanges(value: PageProtection => js.Array[RangeDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerateRanges")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnumerateSymbols(value: () => js.Array[ModuleSymbolDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerateSymbols")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindExportByName(value: String => NativePointer | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findExportByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetExportByName(value: String => NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExportByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


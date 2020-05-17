package typingsSlinky.rcTreeSelect

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import typingsSlinky.rcTreeSelect.anon.Selected
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.FlattenDataNode
import typingsSlinky.rcTreeSelect.interfaceMod.RawValueType
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib/OptionList", JSImport.Namespace)
@js.native
object optionListMod extends js.Object {
  @js.native
  trait OptionListProps[OptionsType /* <: js.Array[js.Object] */] extends js.Object {
    var childrenAsData: Boolean = js.native
    var defaultActiveFirstOption: js.UndefOr[Boolean] = js.native
    var flattenOptions: js.Array[FlattenDataNode] = js.native
    var height: Double = js.native
    var id: String = js.native
    var itemHeight: Double = js.native
    var menuItemSelectedIcon: js.UndefOr[js.Any] = js.native
    var multiple: Boolean = js.native
    var notFoundContent: js.UndefOr[TagMod[Any]] = js.native
    var onScroll: UIEventHandler[HTMLDivElement] = js.native
    var open: Boolean = js.native
    var options: OptionsType = js.native
    var prefixCls: String = js.native
    var searchValue: String = js.native
    var values: Set[RawValueType] = js.native
    /** Tell Select that some value is now active to make accessibility work */
    def onActiveValue(value: RawValueType, index: Double): Unit = js.native
    def onSelect(value: RawValueType, option: Selected): Unit = js.native
    def onToggleOpen(): Unit = js.native
    def onToggleOpen(open: Boolean): Unit = js.native
  }
  
  val default: ForwardRefExoticComponent[
    OptionListProps[js.Array[DataNode]] with (RefAttributes[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefOptionListProps */ _
    ])
  ] = js.native
}


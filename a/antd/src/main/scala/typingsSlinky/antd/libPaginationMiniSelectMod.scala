package typingsSlinky.antd

import slinky.core.ReactComponentClass
import typingsSlinky.antd.libPaginationMiniSelectMod.MiniSelect
import typingsSlinky.antd.libSelectMod.OptionProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/pagination/MiniSelect", JSImport.Namespace)
@js.native
object libPaginationMiniSelectMod extends js.Object {
  @js.native
  trait MiniSelect
    extends Component[js.Any, js.Any, js.Any]
  
  @js.native
  class default () extends MiniSelect
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Option: ReactComponentClass[OptionProps] = js.native
  }
  
}


package typingsSlinky.atAntDashDesignReactDashNative

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.libModalPropsTypeMod.Action
import typingsSlinky.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOrActions
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal", JSImport.Namespace)
@js.native
object libModalMod extends js.Object {
  @js.native
  class default ()
    extends typingsSlinky.atAntDashDesignReactDashNative.libModalModalMod.default
  
  /* static members */
  @js.native
  object default extends js.Object {
    var alert: js.Function4[
        /* title */ TagMod[Any], 
        /* content */ TagMod[Any], 
        /* actions */ js.UndefOr[js.Array[Action[TextStyle]]], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        Double
      ] = js.native
    var contextTypes: Anon_AntLocale = js.native
    var defaultProps: Anon_AnimateAppear = js.native
    var operation: js.Function2[
        /* actions */ js.Array[_], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        Double
      ] = js.native
    var prompt: js.Function7[
        /* title */ TagMod[Any], 
        /* message */ TagMod[Any], 
        /* callbackOrActions */ CallbackOrActions[TextStyle], 
        /* type */ js.UndefOr[String], 
        /* defaultValue */ js.UndefOr[String], 
        /* placeholders */ js.UndefOr[js.Array[String]], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        js.UndefOr[Double]
      ] = js.native
  }
  
}


package typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeMod

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.Anon_AnimateAppear
import typingsSlinky.atAntDashDesignReactDashNative.Anon_AntLocale
import typingsSlinky.atAntDashDesignReactDashNative.libModalMod.default
import typingsSlinky.atAntDashDesignReactDashNative.libModalPropsTypeMod.Action
import typingsSlinky.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOrActions
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native", "Modal")
@js.native
class Modal () extends default

/* static members */
@JSImport("@ant-design/react-native", "Modal")
@js.native
object Modal extends js.Object {
  var alert: js.Function4[
    /* title */ TagMod[Any], 
    /* content */ TagMod[Any], 
    /* actions */ js.UndefOr[js.Array[Action[TextStyle]]], 
    /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
    Unit
  ] = js.native
  var contextTypes: Anon_AntLocale = js.native
  var defaultProps: Anon_AnimateAppear = js.native
  var operation: js.Function2[
    /* actions */ js.Array[_], 
    /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
    Unit
  ] = js.native
  var prompt: js.Function7[
    /* title */ TagMod[Any], 
    /* message */ TagMod[Any], 
    /* callbackOrActions */ CallbackOrActions[TextStyle], 
    /* type */ js.UndefOr[String], 
    /* defaultValue */ js.UndefOr[String], 
    /* placeholders */ js.UndefOr[js.Array[String]], 
    /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
    Unit
  ] = js.native
}


package typingsSlinky.antDesignReactNative.modalModalMod

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.AnonAnimateAppear
import typingsSlinky.antDesignReactNative.AnonAntLocale
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.Action
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal/Modal", JSImport.Default)
@js.native
class default () extends AntmModal

/* static members */
@JSImport("@ant-design/react-native/lib/modal/Modal", JSImport.Default)
@js.native
object default extends js.Object {
  var alert: js.Function4[
    /* title */ TagMod[Any], 
    /* content */ TagMod[Any], 
    /* actions */ js.UndefOr[js.Array[Action[TextStyle]]], 
    /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
    Double
  ] = js.native
  var contextTypes: AnonAntLocale = js.native
  var defaultProps: AnonAnimateAppear = js.native
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


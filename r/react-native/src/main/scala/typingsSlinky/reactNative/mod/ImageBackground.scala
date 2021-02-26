package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.reactNativeStrings.disk
import typingsSlinky.reactNative.reactNativeStrings.diskSlashmemory
import typingsSlinky.reactNative.reactNativeStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-native", "ImageBackground")
@js.native
class ImageBackground ()
  extends Component[ImageBackgroundProps, js.Object, js.Any] {
  
  var abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
  
  def getSize(
    uri: String,
    success: js.Function2[/* width */ Double, /* height */ Double, Unit],
    failure: js.Function1[/* error */ js.Any, Unit]
  ): js.Any = js.native
  
  def prefetch(url: String): js.Any = js.native
  
  var queryCache: js.UndefOr[
    js.Function1[
      /* urls */ js.Array[String], 
      js.Promise[StringDictionary[memory | disk | diskSlashmemory]]
    ]
  ] = js.native
  
  var resizeMode: ImageResizeMode = js.native
}

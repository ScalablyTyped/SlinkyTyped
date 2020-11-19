package typingsSlinky.reactPrimitives.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNative.mod.ImageResolvedAssetSource
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactPrimitives.reactPrimitivesStrings.disk
import typingsSlinky.reactPrimitives.reactPrimitivesStrings.diskSlashmemory
import typingsSlinky.reactPrimitives.reactPrimitivesStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-primitives", "Image")
@js.native
class Image ()
  extends typingsSlinky.reactNative.mod.Image
/* static members */
@JSImport("react-primitives", "Image")
@js.native
object Image extends js.Object {
  
  var abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
  
  def getSize(uri: String, success: js.Function2[/* width */ Double, /* height */ Double, Unit]): js.Any = js.native
  def getSize(
    uri: String,
    success: js.Function2[/* width */ Double, /* height */ Double, Unit],
    failure: js.Function1[/* error */ js.Any, Unit]
  ): js.Any = js.native
  
  def getSizeWithHeaders(
    uri: String,
    headers: StringDictionary[String],
    success: js.Function2[/* width */ Double, /* height */ Double, Unit]
  ): js.Any = js.native
  def getSizeWithHeaders(
    uri: String,
    headers: StringDictionary[String],
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
  
  /**
    * @see https://facebook.github.io/react-native/docs/image.html#resolveassetsource
    */
  def resolveAssetSource(source: ImageSourcePropType): ImageResolvedAssetSource = js.native
}

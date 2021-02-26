package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojcompositeMod.ViewModelContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends StObject {
  
  var metadata: typingsSlinky.oracleOraclejet.ojcompositeMod.Metadata = js.native
  
  def parseFunction(
    value: String,
    name: String,
    meta: js.Object,
    defaultParseFunction: js.Function1[/* value */ String, _]
  ): js.Any = js.native
  
  var view: String = js.native
  
  def viewModel(param0: ViewModelContext): Unit | js.Object = js.native
}
object Metadata {
  
  @scala.inline
  def apply(
    metadata: typingsSlinky.oracleOraclejet.ojcompositeMod.Metadata,
    parseFunction: (String, String, js.Object, js.Function1[/* value */ String, _]) => js.Any,
    view: String,
    viewModel: ViewModelContext => Unit | js.Object
  ): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], parseFunction = js.Any.fromFunction4(parseFunction), view = view.asInstanceOf[js.Any], viewModel = js.Any.fromFunction1(viewModel))
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: typingsSlinky.oracleOraclejet.ojcompositeMod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseFunction(value: (String, String, js.Object, js.Function1[/* value */ String, _]) => js.Any): Self = StObject.set(x, "parseFunction", js.Any.fromFunction4(value))
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: ViewModelContext => Unit | js.Object): Self = StObject.set(x, "viewModel", js.Any.fromFunction1(value))
  }
}

package typingsSlinky.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataReader extends StObject {
  
  def getConstructorMetadata(constructorFunc: js.Function): ConstructorMetadata = js.native
  
  def getPropertiesMetadata(constructorFunc: js.Function): MetadataMap = js.native
}
object MetadataReader {
  
  @scala.inline
  def apply(
    getConstructorMetadata: js.Function => ConstructorMetadata,
    getPropertiesMetadata: js.Function => MetadataMap
  ): MetadataReader = {
    val __obj = js.Dynamic.literal(getConstructorMetadata = js.Any.fromFunction1(getConstructorMetadata), getPropertiesMetadata = js.Any.fromFunction1(getPropertiesMetadata))
    __obj.asInstanceOf[MetadataReader]
  }
  
  @scala.inline
  implicit class MetadataReaderMutableBuilder[Self <: MetadataReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetConstructorMetadata(value: js.Function => ConstructorMetadata): Self = StObject.set(x, "getConstructorMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPropertiesMetadata(value: js.Function => MetadataMap): Self = StObject.set(x, "getPropertiesMetadata", js.Any.fromFunction1(value))
  }
}

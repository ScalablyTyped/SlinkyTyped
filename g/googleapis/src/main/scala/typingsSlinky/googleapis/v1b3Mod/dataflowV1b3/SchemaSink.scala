package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A sink that records can be encoded and written to.
  */
@js.native
trait SchemaSink extends StObject {
  
  /**
    * The codec to use to encode data written to the sink.
    */
  var codec: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The sink to write to, plus its parameters.
    */
  var spec: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object SchemaSink {
  
  @scala.inline
  def apply(): SchemaSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSink]
  }
  
  @scala.inline
  implicit class SchemaSinkMutableBuilder[Self <: SchemaSink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodec(value: StringDictionary[js.Any]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    @scala.inline
    def setSpec(value: StringDictionary[js.Any]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}

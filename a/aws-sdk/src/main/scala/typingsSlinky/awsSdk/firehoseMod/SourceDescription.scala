package typingsSlinky.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceDescription extends StObject {
  
  /**
    * The KinesisStreamSourceDescription value for the source Kinesis data stream.
    */
  var KinesisStreamSourceDescription: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.KinesisStreamSourceDescription] = js.native
}
object SourceDescription {
  
  @scala.inline
  def apply(): SourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceDescription]
  }
  
  @scala.inline
  implicit class SourceDescriptionMutableBuilder[Self <: SourceDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKinesisStreamSourceDescription(value: KinesisStreamSourceDescription): Self = StObject.set(x, "KinesisStreamSourceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamSourceDescriptionUndefined: Self = StObject.set(x, "KinesisStreamSourceDescription", js.undefined)
  }
}

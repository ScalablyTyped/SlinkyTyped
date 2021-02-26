package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedEventProperties extends StObject {
  
  /**
    * event arguments
    */
  var args: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string ]: any}
    */ typingsSlinky.hermesProfileTransformer.hermesProfileTransformerStrings.SharedEventProperties with TopLevel[js.Any]
  ] = js.native
  
  /**
    * event category
    */
  var cat: js.UndefOr[String] = js.native
  
  /**
    * a fixed color name
    */
  var cname: js.UndefOr[String] = js.native
  
  /**
    * name of the event
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * event type (phase)
    */
  var ph: EventsPhase = js.native
  
  /**
    * process ID
    */
  var pid: js.UndefOr[Double] = js.native
  
  /**
    * id for a stackFrame object
    */
  var sf: js.UndefOr[Double] = js.native
  
  /**
    * thread ID
    */
  var tid: js.UndefOr[Double] = js.native
  
  /**
    * tracing clock timestamp
    */
  var ts: js.UndefOr[Double] = js.native
  
  /**
    * thread clock timestamp
    */
  var tts: js.UndefOr[Double] = js.native
}
object SharedEventProperties {
  
  @scala.inline
  def apply(ph: EventsPhase): SharedEventProperties = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedEventProperties]
  }
  
  @scala.inline
  implicit class SharedEventPropertiesMutableBuilder[Self <: SharedEventProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in string ]: any}
      */ typingsSlinky.hermesProfileTransformer.hermesProfileTransformerStrings.SharedEventProperties with TopLevel[js.Any]
    ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setCat(value: String): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatUndefined: Self = StObject.set(x, "cat", js.undefined)
    
    @scala.inline
    def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPh(value: EventsPhase): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
    
    @scala.inline
    def setSf(value: Double): Self = StObject.set(x, "sf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSfUndefined: Self = StObject.set(x, "sf", js.undefined)
    
    @scala.inline
    def setTid(value: Double): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTidUndefined: Self = StObject.set(x, "tid", js.undefined)
    
    @scala.inline
    def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    @scala.inline
    def setTts(value: Double): Self = StObject.set(x, "tts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtsUndefined: Self = StObject.set(x, "tts", js.undefined)
  }
}

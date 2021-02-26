package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.LabelCountWithTotal
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojtimeBaseMod {
  
  @js.native
  trait dvtTimeComponent[SP /* <: dvtTimeComponentSettableProperties */] extends dvtBaseComponent[SP] {
    
    def setProperties(properties: dvtTimeComponentSettablePropertiesLenient): Unit = js.native
  }
  
  type dvtTimeComponentEventMap[SP /* <: dvtTimeComponentSettableProperties */] = dvtBaseComponentEventMap[SP]
  
  type dvtTimeComponentSettableProperties = dvtBaseComponentSettableProperties
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtime-base.dvtTimeComponentSettableProperties> */
  @js.native
  trait dvtTimeComponentSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var trackResize: js.UndefOr[on | off] = js.native
    
    var translations: js.UndefOr[LabelCountWithTotal] = js.native
  }
  object dvtTimeComponentSettablePropertiesLenient {
    
    @scala.inline
    def apply(): dvtTimeComponentSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[dvtTimeComponentSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class dvtTimeComponentSettablePropertiesLenientMutableBuilder[Self <: dvtTimeComponentSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
      
      @scala.inline
      def setTranslations(value: LabelCountWithTotal): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}

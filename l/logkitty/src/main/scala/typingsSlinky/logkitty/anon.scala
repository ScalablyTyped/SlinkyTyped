package typingsSlinky.logkitty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DEBUG extends StObject {
    
    var DEBUG: Double = js.native
    
    var ERROR: Double = js.native
    
    var FATAL: Double = js.native
    
    var INFO: Double = js.native
    
    var SILENT: Double = js.native
    
    var UNKNOWN: Double = js.native
    
    var VERBOSE: Double = js.native
    
    var WARN: Double = js.native
  }
  object DEBUG {
    
    @scala.inline
    def apply(
      DEBUG: Double,
      ERROR: Double,
      FATAL: Double,
      INFO: Double,
      SILENT: Double,
      UNKNOWN: Double,
      VERBOSE: Double,
      WARN: Double
    ): DEBUG = {
      val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SILENT = SILENT.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], VERBOSE = VERBOSE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEBUG]
    }
    
    @scala.inline
    implicit class DEBUGMutableBuilder[Self <: DEBUG] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDEBUG(value: Double): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFATAL(value: Double): Self = StObject.set(x, "FATAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSILENT(value: Double): Self = StObject.set(x, "SILENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUNKNOWN(value: Double): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVERBOSE(value: Double): Self = StObject.set(x, "VERBOSE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWARN(value: Double): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DEFAULT extends StObject {
    
    var DEBUG: Double = js.native
    
    var DEFAULT: Double = js.native
    
    var ERROR: Double = js.native
    
    var INFO: Double = js.native
  }
  object DEFAULT {
    
    @scala.inline
    def apply(DEBUG: Double, DEFAULT: Double, ERROR: Double, INFO: Double): DEFAULT = {
      val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEFAULT]
    }
    
    @scala.inline
    implicit class DEFAULTMutableBuilder[Self <: DEFAULT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDEBUG(value: Double): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDEFAULT(value: Double): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FromName extends StObject {
    
    def fromName(key: js.Any): Double = js.native
  }
  object FromName {
    
    @scala.inline
    def apply(fromName: js.Any => Double): FromName = {
      val __obj = js.Dynamic.literal(fromName = js.Any.fromFunction1(fromName))
      __obj.asInstanceOf[FromName]
    }
    
    @scala.inline
    implicit class FromNameMutableBuilder[Self <: FromName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromName(value: js.Any => Double): Self = StObject.set(x, "fromName", js.Any.fromFunction1(value))
    }
  }
}

package typingsSlinky.jsmediatags

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.jsmediatags.mediaFileReaderMod.default
import typingsSlinky.jsmediatags.typesMod.ByteRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AvoidHeadRequests extends StObject {
    
    var avoidHeadRequests: Boolean = js.native
    
    var disallowedXhrHeaders: js.Array[String] = js.native
    
    var timeoutInSec: Double = js.native
  }
  object AvoidHeadRequests {
    
    @scala.inline
    def apply(avoidHeadRequests: Boolean, disallowedXhrHeaders: js.Array[String], timeoutInSec: Double): AvoidHeadRequests = {
      val __obj = js.Dynamic.literal(avoidHeadRequests = avoidHeadRequests.asInstanceOf[js.Any], disallowedXhrHeaders = disallowedXhrHeaders.asInstanceOf[js.Any], timeoutInSec = timeoutInSec.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvoidHeadRequests]
    }
    
    @scala.inline
    implicit class AvoidHeadRequestsMutableBuilder[Self <: AvoidHeadRequests] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvoidHeadRequests(value: Boolean): Self = StObject.set(x, "avoidHeadRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallowedXhrHeaders(value: js.Array[String]): Self = StObject.set(x, "disallowedXhrHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallowedXhrHeadersVarargs(value: String*): Self = StObject.set(x, "disallowedXhrHeaders", js.Array(value :_*))
      
      @scala.inline
      def setTimeoutInSec(value: Double): Self = StObject.set(x, "timeoutInSec", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CRC extends StObject {
    
    var CRC: Double = js.native
    
    var RESTRICTIONS: Double = js.native
    
    var UPDATE: Double = js.native
  }
  object CRC {
    
    @scala.inline
    def apply(CRC: Double, RESTRICTIONS: Double, UPDATE: Double): CRC = {
      val __obj = js.Dynamic.literal(CRC = CRC.asInstanceOf[js.Any], RESTRICTIONS = RESTRICTIONS.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
      __obj.asInstanceOf[CRC]
    }
    
    @scala.inline
    implicit class CRCMutableBuilder[Self <: CRC] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCRC(value: Double): Self = StObject.set(x, "CRC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESTRICTIONS(value: Double): Self = StObject.set(x, "RESTRICTIONS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUPDATE(value: Double): Self = StObject.set(x, "UPDATE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Compression extends StObject {
    
    var compression: Boolean = js.native
    
    var data_length_indicator: Boolean = js.native
    
    var encryption: Boolean = js.native
    
    var grouping_identity: Boolean = js.native
    
    var unsynchronisation: Boolean = js.native
  }
  object Compression {
    
    @scala.inline
    def apply(
      compression: Boolean,
      data_length_indicator: Boolean,
      encryption: Boolean,
      grouping_identity: Boolean,
      unsynchronisation: Boolean
    ): Compression = {
      val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any], data_length_indicator = data_length_indicator.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], grouping_identity = grouping_identity.asInstanceOf[js.Any], unsynchronisation = unsynchronisation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compression]
    }
    
    @scala.inline
    implicit class CompressionMutableBuilder[Self <: Compression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_length_indicator(value: Boolean): Self = StObject.set(x, "data_length_indicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryption(value: Boolean): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrouping_identity(value: Boolean): Self = StObject.set(x, "grouping_identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsynchronisation(value: Boolean): Self = StObject.set(x, "unsynchronisation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EndIx extends StObject {
    
    var endIx: Double = js.native
    
    var insertIx: js.UndefOr[Double] = js.native
    
    var startIx: Double = js.native
  }
  object EndIx {
    
    @scala.inline
    def apply(endIx: Double, startIx: Double): EndIx = {
      val __obj = js.Dynamic.literal(endIx = endIx.asInstanceOf[js.Any], startIx = startIx.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndIx]
    }
    
    @scala.inline
    implicit class EndIxMutableBuilder[Self <: EndIx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndIx(value: Double): Self = StObject.set(x, "endIx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertIx(value: Double): Self = StObject.set(x, "insertIx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertIxUndefined: Self = StObject.set(x, "insertIx", js.undefined)
      
      @scala.inline
      def setStartIx(value: Double): Self = StObject.set(x, "startIx", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Filealterpreservation extends StObject {
    
    var file_alter_preservation: Boolean = js.native
    
    var read_only: Boolean = js.native
    
    var tag_alter_preservation: Boolean = js.native
  }
  object Filealterpreservation {
    
    @scala.inline
    def apply(file_alter_preservation: Boolean, read_only: Boolean, tag_alter_preservation: Boolean): Filealterpreservation = {
      val __obj = js.Dynamic.literal(file_alter_preservation = file_alter_preservation.asInstanceOf[js.Any], read_only = read_only.asInstanceOf[js.Any], tag_alter_preservation = tag_alter_preservation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filealterpreservation]
    }
    
    @scala.inline
    implicit class FilealterpreservationMutableBuilder[Self <: Filealterpreservation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile_alter_preservation(value: Boolean): Self = StObject.set(x, "file_alter_preservation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead_only(value: Boolean): Self = StObject.set(x, "read_only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag_alter_preservation(value: Boolean): Self = StObject.set(x, "tag_alter_preservation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofMediaFileReader
    extends Instantiable0[default]
       with Instantiable1[/* path */ js.Any, default] {
    
    def canReadFile(file: js.Any): Boolean = js.native
  }
  
  @js.native
  trait TypeofMediaTagReader
    extends Instantiable1[/* mediaFileReader */ default, typingsSlinky.jsmediatags.mediaTagReaderMod.default] {
    
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
}

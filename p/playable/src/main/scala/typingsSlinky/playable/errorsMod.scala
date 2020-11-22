package typingsSlinky.playable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/constants/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  @js.native
  sealed trait Error extends js.Object
  @js.native
  object Error extends js.Object {
    
    @js.native
    sealed trait CONTENT_LOAD extends Error
    
    @js.native
    sealed trait CONTENT_PARSE extends Error
    
    @js.native
    sealed trait LEVEL_LOAD extends Error
    
    @js.native
    sealed trait MANIFEST_INCOMPATIBLE extends Error
    
    @js.native
    sealed trait MANIFEST_LOAD extends Error
    
    @js.native
    sealed trait MANIFEST_PARSE extends Error
    
    @js.native
    sealed trait MEDIA extends Error
    
    @js.native
    sealed trait SRC_PARSE extends Error
    
    @js.native
    sealed trait UNKNOWN extends Error
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Error with String] = js.native
    
    /* "error-content-load" */ val CONTENT_LOAD: typingsSlinky.playable.errorsMod.Error.CONTENT_LOAD with String = js.native
    
    /* "error-content-parse" */ val CONTENT_PARSE: typingsSlinky.playable.errorsMod.Error.CONTENT_PARSE with String = js.native
    
    /* "error-level-load" */ val LEVEL_LOAD: typingsSlinky.playable.errorsMod.Error.LEVEL_LOAD with String = js.native
    
    /* "error-manifest-incompatible" */ val MANIFEST_INCOMPATIBLE: typingsSlinky.playable.errorsMod.Error.MANIFEST_INCOMPATIBLE with String = js.native
    
    /* "error-manifest-load" */ val MANIFEST_LOAD: typingsSlinky.playable.errorsMod.Error.MANIFEST_LOAD with String = js.native
    
    /* "error-manifest-parse" */ val MANIFEST_PARSE: typingsSlinky.playable.errorsMod.Error.MANIFEST_PARSE with String = js.native
    
    /* "error-media" */ val MEDIA: typingsSlinky.playable.errorsMod.Error.MEDIA with String = js.native
    
    /* "error-src-parse" */ val SRC_PARSE: typingsSlinky.playable.errorsMod.Error.SRC_PARSE with String = js.native
    
    /* "error-unknown" */ val UNKNOWN: typingsSlinky.playable.errorsMod.Error.UNKNOWN with String = js.native
  }
}

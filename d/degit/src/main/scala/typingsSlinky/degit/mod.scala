package typingsSlinky.degit

import typingsSlinky.degit.degitStrings.clone
import typingsSlinky.degit.degitStrings.info
import typingsSlinky.degit.degitStrings.remove
import typingsSlinky.degit.degitStrings.warn
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("degit", JSImport.Default)
  @js.native
  def default(src: String, opts: Options): Degit = js.native
  
  @JSImport("degit", "Degit")
  @js.native
  class Degit protected () extends EventEmitter {
    def this(src: String) = this()
    def this(src: String, opts: Options) = this()
    
    /**
      * @async
      */
    def clone(dest: String): js.Promise[Unit] = js.native
    
    @JSName("on")
    def on_info(event: info, callback: js.Function1[/* info */ Info, Unit]): this.type = js.native
    @JSName("on")
    def on_warn(event: warn, callback: js.Function1[/* info */ Info, Unit]): this.type = js.native
    
    /**
      * @async
      */
    def remove(dir: String, dest: String, action: RemoveAction): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Action extends StObject {
    
    var action: String = js.native
    
    var cache: js.UndefOr[Boolean] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object Action {
    
    @scala.inline
    def apply(action: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait DegitAction extends Action {
    
    @JSName("action")
    var action_DegitAction: clone = js.native
    
    var src: String = js.native
  }
  object DegitAction {
    
    @scala.inline
    def apply(action: clone, src: String): DegitAction = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[DegitAction]
    }
    
    @scala.inline
    implicit class DegitActionMutableBuilder[Self <: DegitAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: clone): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.degit.degitStrings.DEST_NOT_EMPTY
    - typingsSlinky.degit.degitStrings.MISSING_REF
    - typingsSlinky.degit.degitStrings.COULD_NOT_DOWNLOAD
    - typingsSlinky.degit.degitStrings.BAD_SRC
    - typingsSlinky.degit.degitStrings.UNSUPPORTED_HOST
    - typingsSlinky.degit.degitStrings.BAD_REF
    - typingsSlinky.degit.degitStrings.COULD_NOT_FETCH
  */
  trait DegitErrorCode extends StObject
  object DegitErrorCode {
    
    @scala.inline
    def BAD_REF: typingsSlinky.degit.degitStrings.BAD_REF = "BAD_REF".asInstanceOf[typingsSlinky.degit.degitStrings.BAD_REF]
    
    @scala.inline
    def BAD_SRC: typingsSlinky.degit.degitStrings.BAD_SRC = "BAD_SRC".asInstanceOf[typingsSlinky.degit.degitStrings.BAD_SRC]
    
    @scala.inline
    def COULD_NOT_DOWNLOAD: typingsSlinky.degit.degitStrings.COULD_NOT_DOWNLOAD = "COULD_NOT_DOWNLOAD".asInstanceOf[typingsSlinky.degit.degitStrings.COULD_NOT_DOWNLOAD]
    
    @scala.inline
    def COULD_NOT_FETCH: typingsSlinky.degit.degitStrings.COULD_NOT_FETCH = "COULD_NOT_FETCH".asInstanceOf[typingsSlinky.degit.degitStrings.COULD_NOT_FETCH]
    
    @scala.inline
    def DEST_NOT_EMPTY: typingsSlinky.degit.degitStrings.DEST_NOT_EMPTY = "DEST_NOT_EMPTY".asInstanceOf[typingsSlinky.degit.degitStrings.DEST_NOT_EMPTY]
    
    @scala.inline
    def MISSING_REF: typingsSlinky.degit.degitStrings.MISSING_REF = "MISSING_REF".asInstanceOf[typingsSlinky.degit.degitStrings.MISSING_REF]
    
    @scala.inline
    def UNSUPPORTED_HOST: typingsSlinky.degit.degitStrings.UNSUPPORTED_HOST = "UNSUPPORTED_HOST".asInstanceOf[typingsSlinky.degit.degitStrings.UNSUPPORTED_HOST]
  }
  
  @js.native
  trait Info extends StObject {
    
    val code: String = js.native
    
    val dest: String = js.native
    
    val message: String = js.native
    
    val repo: Degit = js.native
  }
  object Info {
    
    @scala.inline
    def apply(code: String, dest: String, message: String, repo: Degit): Info = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepo(value: Degit): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.degit.degitStrings.SUCCESS
    - typingsSlinky.degit.degitStrings.FILE_DOES_NOT_EXIST
    - typingsSlinky.degit.degitStrings.REMOVED
    - typingsSlinky.degit.degitStrings.DEST_NOT_EMPTY
    - typingsSlinky.degit.degitStrings.DEST_IS_EMPTY
    - typingsSlinky.degit.degitStrings.USING_CACHE
    - typingsSlinky.degit.degitStrings.FOUND_MATCH
    - typingsSlinky.degit.degitStrings.FILE_EXISTS
    - typingsSlinky.degit.degitStrings.PROXY
    - typingsSlinky.degit.degitStrings.DOWNLOADING
    - typingsSlinky.degit.degitStrings.EXTRACTING
  */
  trait InfoCode extends StObject
  object InfoCode {
    
    @scala.inline
    def DEST_IS_EMPTY: typingsSlinky.degit.degitStrings.DEST_IS_EMPTY = "DEST_IS_EMPTY".asInstanceOf[typingsSlinky.degit.degitStrings.DEST_IS_EMPTY]
    
    @scala.inline
    def DEST_NOT_EMPTY: typingsSlinky.degit.degitStrings.DEST_NOT_EMPTY = "DEST_NOT_EMPTY".asInstanceOf[typingsSlinky.degit.degitStrings.DEST_NOT_EMPTY]
    
    @scala.inline
    def DOWNLOADING: typingsSlinky.degit.degitStrings.DOWNLOADING = "DOWNLOADING".asInstanceOf[typingsSlinky.degit.degitStrings.DOWNLOADING]
    
    @scala.inline
    def EXTRACTING: typingsSlinky.degit.degitStrings.EXTRACTING = "EXTRACTING".asInstanceOf[typingsSlinky.degit.degitStrings.EXTRACTING]
    
    @scala.inline
    def FILE_DOES_NOT_EXIST: typingsSlinky.degit.degitStrings.FILE_DOES_NOT_EXIST = "FILE_DOES_NOT_EXIST".asInstanceOf[typingsSlinky.degit.degitStrings.FILE_DOES_NOT_EXIST]
    
    @scala.inline
    def FILE_EXISTS: typingsSlinky.degit.degitStrings.FILE_EXISTS = "FILE_EXISTS".asInstanceOf[typingsSlinky.degit.degitStrings.FILE_EXISTS]
    
    @scala.inline
    def FOUND_MATCH: typingsSlinky.degit.degitStrings.FOUND_MATCH = "FOUND_MATCH".asInstanceOf[typingsSlinky.degit.degitStrings.FOUND_MATCH]
    
    @scala.inline
    def PROXY: typingsSlinky.degit.degitStrings.PROXY = "PROXY".asInstanceOf[typingsSlinky.degit.degitStrings.PROXY]
    
    @scala.inline
    def REMOVED: typingsSlinky.degit.degitStrings.REMOVED = "REMOVED".asInstanceOf[typingsSlinky.degit.degitStrings.REMOVED]
    
    @scala.inline
    def SUCCESS: typingsSlinky.degit.degitStrings.SUCCESS = "SUCCESS".asInstanceOf[typingsSlinky.degit.degitStrings.SUCCESS]
    
    @scala.inline
    def USING_CACHE: typingsSlinky.degit.degitStrings.USING_CACHE = "USING_CACHE".asInstanceOf[typingsSlinky.degit.degitStrings.USING_CACHE]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * @default false
      */
    var cache: js.UndefOr[Boolean] = js.native
    
    /**
      * @default false
      */
    var force: js.UndefOr[Boolean] = js.native
    
    /**
      * @default undefined
      */
    var mode: js.UndefOr[ValidModes] = js.native
    
    /**
      * @default false
      */
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setMode(value: ValidModes): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait RemoveAction extends Action {
    
    @JSName("action")
    var action_RemoveAction: remove = js.native
    
    var files: js.Array[String] = js.native
  }
  object RemoveAction {
    
    @scala.inline
    def apply(action: remove, files: js.Array[String]): RemoveAction = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveAction]
    }
    
    @scala.inline
    implicit class RemoveActionMutableBuilder[Self <: RemoveAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: remove): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.degit.degitStrings.tar
    - typingsSlinky.degit.degitStrings.git
  */
  trait ValidModes extends StObject
  object ValidModes {
    
    @scala.inline
    def git: typingsSlinky.degit.degitStrings.git = "git".asInstanceOf[typingsSlinky.degit.degitStrings.git]
    
    @scala.inline
    def tar: typingsSlinky.degit.degitStrings.tar = "tar".asInstanceOf[typingsSlinky.degit.degitStrings.tar]
  }
}

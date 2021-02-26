package typingsSlinky.babylonjs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesInputStoreMod {
  
  @JSImport("babylonjs/Misc/filesInputStore", "FilesInputStore")
  @js.native
  class FilesInputStore () extends StObject
  /* static members */
  object FilesInputStore {
    
    @JSImport("babylonjs/Misc/filesInputStore", "FilesInputStore")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * List of files ready to be loaded
      */
    @JSImport("babylonjs/Misc/filesInputStore", "FilesInputStore.FilesToLoad")
    @js.native
    def FilesToLoad: StringDictionary[File] = js.native
    @scala.inline
    def FilesToLoad_=(x: StringDictionary[File]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FilesToLoad")(x.asInstanceOf[js.Any])
  }
}

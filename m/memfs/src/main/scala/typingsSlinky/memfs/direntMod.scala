package typingsSlinky.memfs

import typingsSlinky.memfs.encodingMod.TDataOut
import typingsSlinky.memfs.encodingMod.TEncodingExtended
import typingsSlinky.memfs.nodeMod.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object direntMod {
  
  @JSImport("memfs/lib/Dirent", JSImport.Default)
  @js.native
  class default () extends Dirent
  /* static members */
  object default {
    
    @JSImport("memfs/lib/Dirent", "default.build")
    @js.native
    def build(link: Link): Dirent = js.native
    @JSImport("memfs/lib/Dirent", "default.build")
    @js.native
    def build(link: Link, encoding: TEncodingExtended): Dirent = js.native
  }
  
  @JSImport("memfs/lib/Dirent", "Dirent")
  @js.native
  class Dirent () extends StObject {
    
    var _checkModeProperty: js.Any = js.native
    
    def isBlockDevice(): Boolean = js.native
    
    def isCharacterDevice(): Boolean = js.native
    
    def isDirectory(): Boolean = js.native
    
    def isFIFO(): Boolean = js.native
    
    def isFile(): Boolean = js.native
    
    def isSocket(): Boolean = js.native
    
    def isSymbolicLink(): Boolean = js.native
    
    var mode: js.Any = js.native
    
    var name: TDataOut = js.native
  }
  /* static members */
  object Dirent {
    
    @JSImport("memfs/lib/Dirent", "Dirent.build")
    @js.native
    def build(link: Link): Dirent = js.native
    @JSImport("memfs/lib/Dirent", "Dirent.build")
    @js.native
    def build(link: Link, encoding: TEncodingExtended): Dirent = js.native
  }
}

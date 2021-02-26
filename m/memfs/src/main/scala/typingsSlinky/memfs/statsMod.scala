package typingsSlinky.memfs

import typingsSlinky.memfs.memfsBooleans.`false`
import typingsSlinky.memfs.memfsBooleans.`true`
import typingsSlinky.memfs.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsMod {
  
  @JSImport("memfs/lib/Stats", JSImport.Default)
  @js.native
  class default[T] () extends Stats[T]
  /* static members */
  object default {
    
    @JSImport("memfs/lib/Stats", "default.build")
    @js.native
    def build(node: Node): Stats[TStatNumber] = js.native
    @JSImport("memfs/lib/Stats", "default.build")
    @js.native
    def build(node: Node, bigint: Boolean): Stats[TStatNumber] = js.native
    @JSImport("memfs/lib/Stats", "default.build")
    @js.native
    def build_false(node: Node, bigint: `false`): Stats[Double] = js.native
    @JSImport("memfs/lib/Stats", "default.build")
    @js.native
    def build_true(node: Node, bigint: `true`): Stats[js.BigInt] = js.native
  }
  
  @JSImport("memfs/lib/Stats", "Stats")
  @js.native
  class Stats[T] () extends StObject {
    
    var _checkModeProperty: js.Any = js.native
    
    var atime: js.Date = js.native
    
    var atimeMs: T = js.native
    
    var birthtime: js.Date = js.native
    
    var birthtimeMs: T = js.native
    
    var blksize: T = js.native
    
    var blocks: T = js.native
    
    var ctime: js.Date = js.native
    
    var ctimeMs: T = js.native
    
    var dev: T = js.native
    
    var gid: T = js.native
    
    var ino: T = js.native
    
    def isBlockDevice(): Boolean = js.native
    
    def isCharacterDevice(): Boolean = js.native
    
    def isDirectory(): Boolean = js.native
    
    def isFIFO(): Boolean = js.native
    
    def isFile(): Boolean = js.native
    
    def isSocket(): Boolean = js.native
    
    def isSymbolicLink(): Boolean = js.native
    
    var mode: T = js.native
    
    var mtime: js.Date = js.native
    
    var mtimeMs: T = js.native
    
    var nlink: T = js.native
    
    var rdev: T = js.native
    
    var size: T = js.native
    
    var uid: T = js.native
  }
  /* static members */
  object Stats {
    
    @JSImport("memfs/lib/Stats", "Stats.build")
    @js.native
    def build(node: Node): Stats[TStatNumber] = js.native
    @JSImport("memfs/lib/Stats", "Stats.build")
    @js.native
    def build(node: Node, bigint: Boolean): Stats[TStatNumber] = js.native
    @JSImport("memfs/lib/Stats", "Stats.build")
    @js.native
    def build_false(node: Node, bigint: `false`): Stats[Double] = js.native
    @JSImport("memfs/lib/Stats", "Stats.build")
    @js.native
    def build_true(node: Node, bigint: `true`): Stats[js.BigInt] = js.native
  }
  
  type TStatNumber = Double | js.BigInt
}

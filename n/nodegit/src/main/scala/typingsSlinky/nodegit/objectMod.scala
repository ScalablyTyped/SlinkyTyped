package typingsSlinky.nodegit

import typingsSlinky.nodegit.bufMod.Buf
import typingsSlinky.nodegit.nodegitNumbers.`-1`
import typingsSlinky.nodegit.nodegitNumbers.`-2`
import typingsSlinky.nodegit.nodegitNumbers.`0`
import typingsSlinky.nodegit.nodegitNumbers.`1`
import typingsSlinky.nodegit.nodegitNumbers.`2`
import typingsSlinky.nodegit.nodegitNumbers.`3`
import typingsSlinky.nodegit.nodegitNumbers.`4`
import typingsSlinky.nodegit.nodegitNumbers.`5`
import typingsSlinky.nodegit.nodegitNumbers.`6`
import typingsSlinky.nodegit.nodegitNumbers.`7`
import typingsSlinky.nodegit.objectMod.Object.TYPE
import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("nodegit/object", "Object")
  @js.native
  class Object () extends StObject {
    
    def dup(): js.Promise[Object] = js.native
    
    def free(): Unit = js.native
    
    def id(): Oid = js.native
    
    def lookupByPath(path: String, `type`: TYPE): js.Promise[Object] = js.native
    
    def owner(): Repository = js.native
    
    def peel(targetType: Double): js.Promise[Object] = js.native
    
    def shortId(): js.Promise[Buf] = js.native
    
    def `type`(): Double = js.native
  }
  /* static members */
  object Object {
    
    @JSImport("nodegit/object", "Object.lookup")
    @js.native
    def lookup(repo: Repository, id: Oid, `type`: TYPE): js.Promise[Object] = js.native
    
    @JSImport("nodegit/object", "Object.lookupPrefix")
    @js.native
    def lookupPrefix(repo: Repository, id: Oid, len: Double, `type`: TYPE): js.Promise[Object] = js.native
    
    @JSImport("nodegit/object", "Object.size")
    @js.native
    def size(`type`: TYPE): Double = js.native
    
    @JSImport("nodegit/object", "Object.string2Type")
    @js.native
    def string2Type(str: String): TYPE = js.native
    
    @JSImport("nodegit/object", "Object.type2String")
    @js.native
    def type2String(`type`: TYPE): String = js.native
    
    @JSImport("nodegit/object", "Object.typeisloose")
    @js.native
    def typeisloose(`type`: TYPE): Double = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`-2`
      - typingsSlinky.nodegit.nodegitNumbers.`-1`
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
      - typingsSlinky.nodegit.nodegitNumbers.`2`
      - typingsSlinky.nodegit.nodegitNumbers.`3`
      - typingsSlinky.nodegit.nodegitNumbers.`4`
      - typingsSlinky.nodegit.nodegitNumbers.`5`
      - typingsSlinky.nodegit.nodegitNumbers.`6`
      - typingsSlinky.nodegit.nodegitNumbers.`7`
    */
    trait TYPE extends StObject
    object TYPE {
      
      @scala.inline
      def ANY: `-2` = -2.asInstanceOf[`-2`]
      
      @scala.inline
      def BAD: `-1` = -1.asInstanceOf[`-1`]
      
      @scala.inline
      def BLOB: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def COMMIT: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def EXT1: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def EXT2: `5` = 5.asInstanceOf[`5`]
      
      @scala.inline
      def OFS_DELTA: `6` = 6.asInstanceOf[`6`]
      
      @scala.inline
      def REF_DELTA: `7` = 7.asInstanceOf[`7`]
      
      @scala.inline
      def TAG: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def TREE: `2` = 2.asInstanceOf[`2`]
    }
  }
}

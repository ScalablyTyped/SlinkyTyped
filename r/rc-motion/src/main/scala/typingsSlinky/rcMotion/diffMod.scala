package typingsSlinky.rcMotion

import typingsSlinky.rcMotion.anon.Status
import typingsSlinky.rcMotion.rcMotionStrings.add
import typingsSlinky.rcMotion.rcMotionStrings.keep
import typingsSlinky.rcMotion.rcMotionStrings.remove
import typingsSlinky.rcMotion.rcMotionStrings.removed
import typingsSlinky.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @JSImport("rc-motion/es/util/diff", "STATUS_ADD")
  @js.native
  val STATUS_ADD: add = js.native
  
  @JSImport("rc-motion/es/util/diff", "STATUS_KEEP")
  @js.native
  val STATUS_KEEP: keep = js.native
  
  @JSImport("rc-motion/es/util/diff", "STATUS_REMOVE")
  @js.native
  val STATUS_REMOVE: remove = js.native
  
  @JSImport("rc-motion/es/util/diff", "STATUS_REMOVED")
  @js.native
  val STATUS_REMOVED: removed = js.native
  
  @JSImport("rc-motion/es/util/diff", "diffKeys")
  @js.native
  def diffKeys(): js.Array[KeyObject] = js.native
  @JSImport("rc-motion/es/util/diff", "diffKeys")
  @js.native
  def diffKeys(prevKeys: js.UndefOr[scala.Nothing], currentKeys: js.Array[KeyObject]): js.Array[KeyObject] = js.native
  @JSImport("rc-motion/es/util/diff", "diffKeys")
  @js.native
  def diffKeys(prevKeys: js.Array[KeyObject]): js.Array[KeyObject] = js.native
  @JSImport("rc-motion/es/util/diff", "diffKeys")
  @js.native
  def diffKeys(prevKeys: js.Array[KeyObject], currentKeys: js.Array[KeyObject]): js.Array[KeyObject] = js.native
  
  @JSImport("rc-motion/es/util/diff", "parseKeys")
  @js.native
  def parseKeys(): js.Array[Status] = js.native
  @JSImport("rc-motion/es/util/diff", "parseKeys")
  @js.native
  def parseKeys(keys: js.Array[_]): js.Array[Status] = js.native
  
  @JSImport("rc-motion/es/util/diff", "wrapKeyToObject")
  @js.native
  def wrapKeyToObject(key: Key): Status = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcMotion.rcMotionStrings.add
    - typingsSlinky.rcMotion.rcMotionStrings.keep
    - typingsSlinky.rcMotion.rcMotionStrings.remove
    - typingsSlinky.rcMotion.rcMotionStrings.removed
  */
  trait DiffStatus extends StObject
  object DiffStatus {
    
    @scala.inline
    def add: typingsSlinky.rcMotion.rcMotionStrings.add = "add".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.add]
    
    @scala.inline
    def keep: typingsSlinky.rcMotion.rcMotionStrings.keep = "keep".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.keep]
    
    @scala.inline
    def remove: typingsSlinky.rcMotion.rcMotionStrings.remove = "remove".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.remove]
    
    @scala.inline
    def removed: typingsSlinky.rcMotion.rcMotionStrings.removed = "removed".asInstanceOf[typingsSlinky.rcMotion.rcMotionStrings.removed]
  }
  
  @js.native
  trait KeyObject extends StObject {
    
    var key: Key = js.native
    
    var status: js.UndefOr[DiffStatus] = js.native
  }
  object KeyObject {
    
    @scala.inline
    def apply(key: Key): KeyObject = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyObject]
    }
    
    @scala.inline
    implicit class KeyObjectMutableBuilder[Self <: KeyObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: DiffStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}

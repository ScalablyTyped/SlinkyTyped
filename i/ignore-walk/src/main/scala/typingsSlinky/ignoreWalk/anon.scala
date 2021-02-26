package typingsSlinky.ignoreWalk

import typingsSlinky.ignoreWalk.mod.Walker
import typingsSlinky.ignoreWalk.mod.WalkerSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Follow extends StObject {
    
    var follow: Boolean = js.native
    
    var ignoreFiles: js.Array[String] = js.native
    
    var includeEmpty: Boolean = js.native
    
    var parent: Walker | WalkerSync = js.native
    
    var path: String = js.native
  }
  object Follow {
    
    @scala.inline
    def apply(
      follow: Boolean,
      ignoreFiles: js.Array[String],
      includeEmpty: Boolean,
      parent: Walker | WalkerSync,
      path: String
    ): Follow = {
      val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], ignoreFiles = ignoreFiles.asInstanceOf[js.Any], includeEmpty = includeEmpty.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Follow]
    }
    
    @scala.inline
    implicit class FollowMutableBuilder[Self <: Follow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFiles(value: js.Array[String]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value :_*))
      
      @scala.inline
      def setIncludeEmpty(value: Boolean): Self = StObject.set(x, "includeEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Walker | WalkerSync): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}

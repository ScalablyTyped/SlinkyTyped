package typingsSlinky.klawSync

import typingsSlinky.klawSync.anon.ReaddirSync
import typingsSlinky.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("klaw-sync", JSImport.Namespace)
  @js.native
  def apply(root: String): js.Array[Item] = js.native
  @JSImport("klaw-sync", JSImport.Namespace)
  @js.native
  def apply(root: String, options: Options): js.Array[Item] = js.native
  
  type Filter = js.Function1[/* item */ Item, Boolean]
  
  @js.native
  trait Item extends StObject {
    
    var path: String = js.native
    
    var stats: Stats = js.native
  }
  object Item {
    
    @scala.inline
    def apply(path: String, stats: Stats): Item = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * @description The number of times to recurse before stopping.
      *              -1 for unlimited.
      * @default -1
      * @since v5.0.0
      */
    var depthLimit: js.UndefOr[Double] = js.native
    
    /**
      * @description function that gets one argument fn({path: '', stats: {}}) and returns true to include
      *              or false to exclude the item
      * @since v2.0.0
      */
    var filter: js.UndefOr[Filter] = js.native
    
    /**
      * @description Custom fs, useful when mocking fs object.
      * @default graceful-fs
      * @since v4.0.0
      */
    var fs: js.UndefOr[ReaddirSync] = js.native
    
    /**
      * @description True to only return files (ignore directories).
      *              Defaults to false if not specified.
      * @default false
      */
    var nodir: js.UndefOr[Boolean] = js.native
    
    /**
      * @description True to only return directories (ignore files).
      *              Defaults to false if not specified.
      * @default false
      */
    var nofile: js.UndefOr[Boolean] = js.native
    
    /**
      * @description traverse all subdirectories, regardless of `filter` option.
      *
      * When set to true, traverseAll produces similar behavior to the default
      * behavior prior to `v4.0.0`. The current default of `traverseAll: false`
      * is equivalent to the old `noRecurseOnFailedFilter: true`).
      *
      * @since v6.0.0
      */
    var traverseAll: js.UndefOr[Boolean] = js.native
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
      def setDepthLimit(value: Double): Self = StObject.set(x, "depthLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthLimitUndefined: Self = StObject.set(x, "depthLimit", js.undefined)
      
      @scala.inline
      def setFilter(value: /* item */ Item => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFs(value: ReaddirSync): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setNodir(value: Boolean): Self = StObject.set(x, "nodir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodirUndefined: Self = StObject.set(x, "nodir", js.undefined)
      
      @scala.inline
      def setNofile(value: Boolean): Self = StObject.set(x, "nofile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNofileUndefined: Self = StObject.set(x, "nofile", js.undefined)
      
      @scala.inline
      def setTraverseAll(value: Boolean): Self = StObject.set(x, "traverseAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraverseAllUndefined: Self = StObject.set(x, "traverseAll", js.undefined)
    }
  }
}

package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.fastGlobBooleans.`true`
import typingsSlinky.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-glob", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[typingsSlinky.fastGlob.typesMod.Pattern]): js.Promise[js.Array[String]] = js.native
  @JSImport("fast-glob", JSImport.Namespace)
  @js.native
  def apply(
    source: js.Array[typingsSlinky.fastGlob.typesMod.Pattern],
    options: (typingsSlinky.fastGlob.settingsMod.Options with EntryObjectPredicate) | typingsSlinky.fastGlob.settingsMod.Options
  ): js.Promise[js.Array[typingsSlinky.fastGlob.typesMod.Entry]] = js.native
  @JSImport("fast-glob", JSImport.Namespace)
  @js.native
  def apply(source: typingsSlinky.fastGlob.typesMod.Pattern): js.Promise[js.Array[String]] = js.native
  @JSImport("fast-glob", JSImport.Namespace)
  @js.native
  def apply(
    source: typingsSlinky.fastGlob.typesMod.Pattern,
    options: (typingsSlinky.fastGlob.settingsMod.Options with EntryObjectPredicate) | typingsSlinky.fastGlob.settingsMod.Options
  ): js.Promise[js.Array[typingsSlinky.fastGlob.typesMod.Entry]] = js.native
  
  @JSImport("fast-glob", "escapePath")
  @js.native
  def escapePath(source: typingsSlinky.fastGlob.typesMod.Pattern): typingsSlinky.fastGlob.typesMod.Pattern = js.native
  
  @JSImport("fast-glob", "generateTasks")
  @js.native
  def generateTasks(source: js.Array[typingsSlinky.fastGlob.typesMod.Pattern]): js.Array[Task] = js.native
  @JSImport("fast-glob", "generateTasks")
  @js.native
  def generateTasks(
    source: js.Array[typingsSlinky.fastGlob.typesMod.Pattern],
    options: typingsSlinky.fastGlob.settingsMod.Options
  ): js.Array[Task] = js.native
  @JSImport("fast-glob", "generateTasks")
  @js.native
  def generateTasks(source: typingsSlinky.fastGlob.typesMod.Pattern): js.Array[Task] = js.native
  @JSImport("fast-glob", "generateTasks")
  @js.native
  def generateTasks(
    source: typingsSlinky.fastGlob.typesMod.Pattern,
    options: typingsSlinky.fastGlob.settingsMod.Options
  ): js.Array[Task] = js.native
  
  @JSImport("fast-glob", "isDynamicPattern")
  @js.native
  def isDynamicPattern(source: typingsSlinky.fastGlob.typesMod.Pattern): Boolean = js.native
  @JSImport("fast-glob", "isDynamicPattern")
  @js.native
  def isDynamicPattern(
    source: typingsSlinky.fastGlob.typesMod.Pattern,
    options: typingsSlinky.fastGlob.settingsMod.Options
  ): Boolean = js.native
  
  @JSImport("fast-glob", "stream")
  @js.native
  def stream(source: js.Array[typingsSlinky.fastGlob.typesMod.Pattern]): ReadableStream = js.native
  @JSImport("fast-glob", "stream")
  @js.native
  def stream(
    source: js.Array[typingsSlinky.fastGlob.typesMod.Pattern],
    options: typingsSlinky.fastGlob.settingsMod.Options
  ): ReadableStream = js.native
  @JSImport("fast-glob", "stream")
  @js.native
  def stream(source: typingsSlinky.fastGlob.typesMod.Pattern): ReadableStream = js.native
  @JSImport("fast-glob", "stream")
  @js.native
  def stream(
    source: typingsSlinky.fastGlob.typesMod.Pattern,
    options: typingsSlinky.fastGlob.settingsMod.Options
  ): ReadableStream = js.native
  
  @JSImport("fast-glob", "sync")
  @js.native
  def sync(source: js.Array[typingsSlinky.fastGlob.typesMod.Pattern]): js.Array[String] = js.native
  @JSImport("fast-glob", "sync")
  @js.native
  def sync(
    source: js.Array[typingsSlinky.fastGlob.typesMod.Pattern],
    options: (typingsSlinky.fastGlob.settingsMod.Options with EntryObjectPredicate) | typingsSlinky.fastGlob.settingsMod.Options
  ): js.Array[typingsSlinky.fastGlob.typesMod.Entry] = js.native
  @JSImport("fast-glob", "sync")
  @js.native
  def sync(source: typingsSlinky.fastGlob.typesMod.Pattern): js.Array[String] = js.native
  @JSImport("fast-glob", "sync")
  @js.native
  def sync(
    source: typingsSlinky.fastGlob.typesMod.Pattern,
    options: (typingsSlinky.fastGlob.settingsMod.Options with EntryObjectPredicate) | typingsSlinky.fastGlob.settingsMod.Options
  ): js.Array[typingsSlinky.fastGlob.typesMod.Entry] = js.native
  
  type Entry = typingsSlinky.fastGlob.typesMod.Entry
  
  /* Inlined {[ TKey in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'objectMode'> ]: -? true} */
  @js.native
  trait EntryObjectModePredicate extends EntryObjectPredicate {
    
    var objectMode: `true` = js.native
  }
  object EntryObjectModePredicate {
    
    @scala.inline
    def apply(objectMode: `true`): EntryObjectModePredicate = {
      val __obj = js.Dynamic.literal(objectMode = objectMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryObjectModePredicate]
    }
    
    @scala.inline
    implicit class EntryObjectModePredicateMutableBuilder[Self <: EntryObjectModePredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjectMode(value: `true`): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fastGlob.mod.EntryObjectModePredicate
    - typingsSlinky.fastGlob.mod.EntryStatsPredicate
  */
  trait EntryObjectPredicate extends StObject
  object EntryObjectPredicate {
    
    @scala.inline
    def EntryObjectModePredicate(objectMode: `true`): typingsSlinky.fastGlob.mod.EntryObjectModePredicate = {
      val __obj = js.Dynamic.literal(objectMode = objectMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.fastGlob.mod.EntryObjectModePredicate]
    }
    
    @scala.inline
    def EntryStatsPredicate(stats: `true`): typingsSlinky.fastGlob.mod.EntryStatsPredicate = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.fastGlob.mod.EntryStatsPredicate]
    }
  }
  
  /* Inlined {[ TKey in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'stats'> ]: -? true} */
  @js.native
  trait EntryStatsPredicate extends EntryObjectPredicate {
    
    var stats: `true` = js.native
  }
  object EntryStatsPredicate {
    
    @scala.inline
    def apply(stats: `true`): EntryStatsPredicate = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryStatsPredicate]
    }
    
    @scala.inline
    implicit class EntryStatsPredicateMutableBuilder[Self <: EntryStatsPredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStats(value: `true`): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  type FileSystemAdapter = typingsSlinky.fastGlob.typesMod.FileSystemAdapter
  
  type Options = typingsSlinky.fastGlob.settingsMod.Options
  
  type Pattern = typingsSlinky.fastGlob.typesMod.Pattern
  
  type Task = typingsSlinky.fastGlob.tasksMod.Task
}

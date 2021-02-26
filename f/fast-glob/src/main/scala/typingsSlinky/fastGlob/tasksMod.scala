package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.settingsMod.default
import typingsSlinky.fastGlob.typesMod.Pattern
import typingsSlinky.fastGlob.typesMod.PatternsGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasksMod {
  
  @JSImport("fast-glob/out/managers/tasks", "convertPatternGroupToTask")
  @js.native
  def convertPatternGroupToTask(base: String, positive: js.Array[Pattern], negative: js.Array[Pattern], dynamic: Boolean): Task = js.native
  
  @JSImport("fast-glob/out/managers/tasks", "convertPatternGroupsToTasks")
  @js.native
  def convertPatternGroupsToTasks(positive: PatternsGroup, negative: js.Array[Pattern], dynamic: Boolean): js.Array[Task] = js.native
  
  @JSImport("fast-glob/out/managers/tasks", "convertPatternsToTasks")
  @js.native
  def convertPatternsToTasks(positive: js.Array[Pattern], negative: js.Array[Pattern], dynamic: Boolean): js.Array[Task] = js.native
  
  @JSImport("fast-glob/out/managers/tasks", "generate")
  @js.native
  def generate(patterns: js.Array[Pattern], settings: default): js.Array[Task] = js.native
  
  @JSImport("fast-glob/out/managers/tasks", "getNegativePatternsAsPositive")
  @js.native
  def getNegativePatternsAsPositive(patterns: js.Array[Pattern], ignore: js.Array[Pattern]): js.Array[Pattern] = js.native
  
  @JSImport("fast-glob/out/managers/tasks", "getPositivePatterns")
  @js.native
  def getPositivePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
  
  @JSImport("fast-glob/out/managers/tasks", "groupPatternsByBaseDirectory")
  @js.native
  def groupPatternsByBaseDirectory(patterns: js.Array[Pattern]): PatternsGroup = js.native
  
  @js.native
  trait Task extends StObject {
    
    var base: String = js.native
    
    var dynamic: Boolean = js.native
    
    var negative: js.Array[Pattern] = js.native
    
    var patterns: js.Array[Pattern] = js.native
    
    var positive: js.Array[Pattern] = js.native
  }
  object Task {
    
    @scala.inline
    def apply(
      base: String,
      dynamic: Boolean,
      negative: js.Array[Pattern],
      patterns: js.Array[Pattern],
      positive: js.Array[Pattern]
    ): Task = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], dynamic = dynamic.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    @scala.inline
    implicit class TaskMutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegative(value: js.Array[Pattern]): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeVarargs(value: Pattern*): Self = StObject.set(x, "negative", js.Array(value :_*))
      
      @scala.inline
      def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value :_*))
      
      @scala.inline
      def setPositive(value: js.Array[Pattern]): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveVarargs(value: Pattern*): Self = StObject.set(x, "positive", js.Array(value :_*))
    }
  }
}

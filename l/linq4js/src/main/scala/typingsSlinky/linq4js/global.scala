package typingsSlinky.linq4js

import typingsSlinky.linq4js.Linq4JS.OrderDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Linq4JS extends js.Object {
    
    @js.native
    class EvaluateCommand protected ()
      extends typingsSlinky.linq4js.Linq4JS.EvaluateCommand {
      def this(command: String, identifier: String*) = this()
    }
    
    @js.native
    class EvaluateCommandResult protected ()
      extends typingsSlinky.linq4js.Linq4JS.EvaluateCommandResult {
      def this(cmd: String, fn: String) = this()
    }
    
    @js.native
    class GeneratedEntity ()
      extends typingsSlinky.linq4js.Linq4JS.GeneratedEntity
    
    @js.native
    class Helper ()
      extends typingsSlinky.linq4js.Linq4JS.Helper
    /* static members */
    @js.native
    object Helper extends js.Object {
      
      var Commands: Array[typingsSlinky.linq4js.Linq4JS.EvaluateCommand] = js.native
      
      def ConvertFunction[T](testFunction: T): T = js.native
      def ConvertFunction[T](testFunction: T, noAutoReturn: js.UndefOr[scala.Nothing], noBracketReplace: Boolean): T = js.native
      def ConvertFunction[T](testFunction: T, noAutoReturn: Boolean): T = js.native
      def ConvertFunction[T](testFunction: T, noAutoReturn: Boolean, noBracketReplace: Boolean): T = js.native
      def ConvertFunction[T](testFunction: String): T = js.native
      def ConvertFunction[T](testFunction: String, noAutoReturn: js.UndefOr[scala.Nothing], noBracketReplace: Boolean): T = js.native
      def ConvertFunction[T](testFunction: String, noAutoReturn: Boolean): T = js.native
      def ConvertFunction[T](testFunction: String, noAutoReturn: Boolean, noBracketReplace: Boolean): T = js.native
      
      var ConvertStringFunction: js.Any = js.native
      
      def CreateArrayData(array: Array[_]): Unit = js.native
      def CreateArrayData(array: Array[_], value: js.Any): Unit = js.native
      
      def MatchCommand(cmd: String): typingsSlinky.linq4js.Linq4JS.EvaluateCommandResult = js.native
      
      def NonEnumerable(name: String, value: js.Function): Unit = js.native
      
      def OrderCompareFunction[T](valueSelector: js.Function1[/* item */ T, _], a: T, b: T, invert: Boolean): Double = js.native
      
      def SplitCommand(command: String): Array[String] = js.native
    }
    
    @js.native
    object OrderDirection extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.linq4js.Linq4JS.OrderDirection with Double] = js.native
      
      /* 0 */ val Ascending: typingsSlinky.linq4js.Linq4JS.OrderDirection.Ascending with Double = js.native
      
      /* 1 */ val Descending: typingsSlinky.linq4js.Linq4JS.OrderDirection.Descending with Double = js.native
    }
    
    @js.native
    class OrderEntry protected ()
      extends typingsSlinky.linq4js.Linq4JS.OrderEntry {
      def this(_direction: OrderDirection, _valueSelector: js.Function1[/* item */ js.Any, _]) = this()
    }
    
    @js.native
    class SelectEntry protected ()
      extends typingsSlinky.linq4js.Linq4JS.SelectEntry {
      def this(n: String, p: String) = this()
    }
  }
}

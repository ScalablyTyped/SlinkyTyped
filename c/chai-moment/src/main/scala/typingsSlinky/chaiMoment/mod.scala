package typingsSlinky.chaiMoment

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.chai.Chai.ChaiPlugin
import typingsSlinky.chaiMoment.mod.global.ChaiMoment.Granularity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-moment", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait AssertStatic extends StObject {
        
        def afterMoment(`val`: js.Any, exp: js.Any): Unit = js.native
        def afterMoment(`val`: js.Any, exp: js.Any, granularity: Granularity): Unit = js.native
        def afterMoment(`val`: js.Any, exp: js.Any, granularity: Granularity, msg: String): Unit = js.native
        def afterMoment(`val`: js.Any, exp: js.Any, msg: String): Unit = js.native
        
        def beforeMoment(`val`: js.Any, exp: js.Any): Unit = js.native
        def beforeMoment(`val`: js.Any, exp: js.Any, granularity: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
        def beforeMoment(`val`: js.Any, exp: js.Any, granularity: Granularity): Unit = js.native
        def beforeMoment(`val`: js.Any, exp: js.Any, granularity: Granularity, msg: String): Unit = js.native
        def beforeMoment(`val`: js.Any, exp: js.Any, msg: String): Unit = js.native
        
        def sameMoment(`val`: js.Any, exp: js.Any): Unit = js.native
        def sameMoment(`val`: js.Any, exp: js.Any, granularity: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
        def sameMoment(`val`: js.Any, exp: js.Any, granularity: Granularity): Unit = js.native
        def sameMoment(`val`: js.Any, exp: js.Any, granularity: Granularity, msg: String): Unit = js.native
        def sameMoment(`val`: js.Any, exp: js.Any, msg: String): Unit = js.native
      }
      
      @js.native
      trait Assertion extends StObject {
        
        def afterMoment(expected: js.Any): Unit = js.native
        def afterMoment(expected: js.Any, granularity: Granularity): Unit = js.native
        
        def beforeMoment(expected: js.Any): Unit = js.native
        def beforeMoment(expected: js.Any, granularity: Granularity): Unit = js.native
        
        def sameMoment(expected: js.Any): Unit = js.native
        def sameMoment(expected: js.Any, granularity: Granularity): Unit = js.native
      }
    }
    
    object ChaiMoment {
      
      /* Rewritten from type alias, can be one of: 
        - typingsSlinky.chaiMoment.chaiMomentStrings.year
        - typingsSlinky.chaiMoment.chaiMomentStrings.month
        - typingsSlinky.chaiMoment.chaiMomentStrings.week
        - typingsSlinky.chaiMoment.chaiMomentStrings.day
        - typingsSlinky.chaiMoment.chaiMomentStrings.hour
        - typingsSlinky.chaiMoment.chaiMomentStrings.minute
        - typingsSlinky.chaiMoment.chaiMomentStrings.second
      */
      trait Granularity extends StObject
      object Granularity {
        
        @scala.inline
        def day: typingsSlinky.chaiMoment.chaiMomentStrings.day = "day".asInstanceOf[typingsSlinky.chaiMoment.chaiMomentStrings.day]
        
        @scala.inline
        def hour: typingsSlinky.chaiMoment.chaiMomentStrings.hour = "hour".asInstanceOf[typingsSlinky.chaiMoment.chaiMomentStrings.hour]
        
        @scala.inline
        def minute: typingsSlinky.chaiMoment.chaiMomentStrings.minute = "minute".asInstanceOf[typingsSlinky.chaiMoment.chaiMomentStrings.minute]
        
        @scala.inline
        def month: typingsSlinky.chaiMoment.chaiMomentStrings.month = "month".asInstanceOf[typingsSlinky.chaiMoment.chaiMomentStrings.month]
        
        @scala.inline
        def second: typingsSlinky.chaiMoment.chaiMomentStrings.second = "second".asInstanceOf[typingsSlinky.chaiMoment.chaiMomentStrings.second]
        
        @scala.inline
        def week: typingsSlinky.chaiMoment.chaiMomentStrings.week = "week".asInstanceOf[typingsSlinky.chaiMoment.chaiMomentStrings.week]
        
        @scala.inline
        def year: typingsSlinky.chaiMoment.chaiMomentStrings.year = "year".asInstanceOf[typingsSlinky.chaiMoment.chaiMomentStrings.year]
      }
    }
  }
}

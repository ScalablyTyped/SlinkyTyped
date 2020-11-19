package typingsSlinky.chaiMoment.mod.global

import typingsSlinky.chaiMoment.mod.global.ChaiMoment.Granularity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Chai")
@js.native
object Chai extends js.Object {
  
  @js.native
  trait AssertStatic extends js.Object {
    
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
  trait Assertion extends js.Object {
    
    def afterMoment(expected: js.Any): Unit = js.native
    def afterMoment(expected: js.Any, granularity: Granularity): Unit = js.native
    
    def beforeMoment(expected: js.Any): Unit = js.native
    def beforeMoment(expected: js.Any, granularity: Granularity): Unit = js.native
    
    def sameMoment(expected: js.Any): Unit = js.native
    def sameMoment(expected: js.Any, granularity: Granularity): Unit = js.native
  }
}

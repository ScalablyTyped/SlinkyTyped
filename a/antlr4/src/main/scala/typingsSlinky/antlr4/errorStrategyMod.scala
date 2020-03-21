package typingsSlinky.antlr4

import typingsSlinky.antlr4.recognizerMod.Recognizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/error/ErrorStrategy", JSImport.Namespace)
@js.native
object errorStrategyMod extends js.Object {
  @js.native
  class BailErrorStrategy () extends ErrorStrategy
  
  @js.native
  class DefaultErrorStrategy () extends ErrorStrategy
  
  @js.native
  class ErrorStrategy () extends js.Object {
    def inErrorRecoveryMode(recognizer: Recognizer): Unit = js.native
    def recover(recognizer: Recognizer, e: js.Error): Unit = js.native
    def recoverInline(recognizer: Recognizer): Unit = js.native
    def reportError(recognizer: Recognizer): Unit = js.native
    def reset(recognizer: Recognizer): Unit = js.native
    def sync(recognizer: Recognizer): Unit = js.native
  }
  
}


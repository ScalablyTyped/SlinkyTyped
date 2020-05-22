package typingsSlinky.javascriptObfuscator.istacktraceanalyzerMod

import typingsSlinky.javascriptObfuscator.ianalyzerMod.IAnalyzer
import typingsSlinky.javascriptObfuscator.istacktracedataMod.IStackTraceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackTraceAnalyzer extends IAnalyzer[IStackTraceData]

object IStackTraceAnalyzer {
  @scala.inline
  def apply(
    analyze: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any => js.Array[IStackTraceData]
  ): IStackTraceAnalyzer = {
    val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction1(analyze))
    __obj.asInstanceOf[IStackTraceAnalyzer]
  }
}


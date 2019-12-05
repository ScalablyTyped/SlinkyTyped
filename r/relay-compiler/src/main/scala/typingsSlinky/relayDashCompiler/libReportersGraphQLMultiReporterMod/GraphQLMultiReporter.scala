package typingsSlinky.relayDashCompiler.libReportersGraphQLMultiReporterMod

import typingsSlinky.relayDashCompiler.libReportersGraphQLReporterMod.GraphQLReporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLMultiReporter extends GraphQLReporter

object GraphQLMultiReporter {
  @scala.inline
  def apply(
    reportError: (String, js.Error) => Unit,
    reportMessage: String => Unit,
    reportTime: (String, Double) => Unit
  ): GraphQLMultiReporter = {
    val __obj = js.Dynamic.literal(reportError = js.Any.fromFunction2(reportError), reportMessage = js.Any.fromFunction1(reportMessage), reportTime = js.Any.fromFunction2(reportTime))
  
    __obj.asInstanceOf[GraphQLMultiReporter]
  }
}


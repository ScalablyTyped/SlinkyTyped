package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayRuntimeStrings.queryresourceDotfetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEventQueryResourceFetch extends LogEvent {
  // FetchPolicy from relay-experimental
  val fetchPolicy: String = js.native
  val name: queryresourceDotfetch = js.native
  val operation: OperationDescriptor = js.native
  val queryAvailability: OperationAvailability = js.native
  // RenderPolicy from relay-experimental
  val renderPolicy: String = js.native
  val shouldFetch: Boolean = js.native
}

object LogEventQueryResourceFetch {
  @scala.inline
  def apply(
    fetchPolicy: String,
    name: queryresourceDotfetch,
    operation: OperationDescriptor,
    queryAvailability: OperationAvailability,
    renderPolicy: String,
    shouldFetch: Boolean
  ): LogEventQueryResourceFetch = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], queryAvailability = queryAvailability.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any], shouldFetch = shouldFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEventQueryResourceFetch]
  }
  @scala.inline
  implicit class LogEventQueryResourceFetchOps[Self <: LogEventQueryResourceFetch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetchPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: queryresourceDotfetch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: OperationDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryAvailability(value: OperationAvailability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldFetch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFetch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


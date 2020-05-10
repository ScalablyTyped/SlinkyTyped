package typingsSlinky.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCase extends js.Object {
  /** Test expectation. */
  var expectation: js.UndefOr[String] = js.native
  /**
    * Optional function mocks for service-defined functions. If not set, any
    * service defined function is expected to return an error, which may or may
    * not influence the test outcome.
    */
  var functionMocks: js.UndefOr[js.Array[FunctionMock]] = js.native
  /**
    * Request context.
    *
    * The exact format of the request context is service-dependent. See the
    * appropriate service documentation for information about the supported
    * fields and types on the request. Minimally, all services support the
    * following fields and types:
    *
    * Request field  | Type
    * ---------------|-----------------
    * auth.uid       | `string`
    * auth.token     | `map<string, string>`
    * headers        | `map<string, string>`
    * method         | `string`
    * params         | `map<string, string>`
    * path           | `string`
    * time           | `google.protobuf.Timestamp`
    *
    * If the request value is not well-formed for the service, the request will
    * be rejected as an invalid argument.
    */
  var request: js.UndefOr[js.Any] = js.native
  /**
    * Optional resource value as it appears in persistent storage before the
    * request is fulfilled.
    *
    * The resource type depends on the `request.path` value.
    */
  var resource: js.UndefOr[js.Any] = js.native
}

object TestCase {
  @scala.inline
  def apply(): TestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCase]
  }
  @scala.inline
  implicit class TestCaseOps[Self <: TestCase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpectation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectation")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionMocks(value: js.Array[FunctionMock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionMocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionMocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionMocks")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}


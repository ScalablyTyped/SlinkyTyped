package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for the expected URL mappings.
  */
@js.native
trait SchemaUrlMapTest extends js.Object {
  /**
    * The weight to use for the supplied host and path when using advanced
    * routing rules that involve traffic splitting.
    */
  var backendServiceWeight: js.UndefOr[Double] = js.native
  /**
    * Description of this test case.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The expected URL that should be redirected to for the host and path being
    * tested.
    */
  var expectedUrlRedirect: js.UndefOr[String] = js.native
  /**
    * Host portion of the URL.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Path portion of the URL.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Expected BackendService resource the given URL should be mapped to.
    */
  var service: js.UndefOr[String] = js.native
}

object SchemaUrlMapTest {
  @scala.inline
  def apply(): SchemaUrlMapTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapTest]
  }
  @scala.inline
  implicit class SchemaUrlMapTestOps[Self <: SchemaUrlMapTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackendServiceWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendServiceWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackendServiceWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendServiceWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedUrlRedirect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedUrlRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedUrlRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedUrlRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}


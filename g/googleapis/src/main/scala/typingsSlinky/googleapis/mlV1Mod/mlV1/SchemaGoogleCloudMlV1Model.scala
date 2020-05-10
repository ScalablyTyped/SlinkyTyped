package typingsSlinky.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a machine learning solution.  A model can have multiple
  * versions, each of which is a deployed, trained model ready to receive
  * prediction requests. The model itself is just a container.
  */
@js.native
trait SchemaGoogleCloudMlV1Model extends js.Object {
  /**
    * Output only. The default version of the model. This version will be used
    * to handle prediction requests that do not specify a version.  You can
    * change the default version by calling
    * [projects.methods.versions.setDefault](/ml-engine/reference/rest/v1/projects.models.versions/setDefault).
    */
  var defaultVersion: js.UndefOr[SchemaGoogleCloudMlV1Version] = js.native
  /**
    * Optional. The description specified for the model when it was created.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * `etag` is used for optimistic concurrency control as a way to help
    * prevent simultaneous updates of a model from overwriting each other. It
    * is strongly suggested that systems make use of the `etag` in the
    * read-modify-write cycle to perform model updates in order to avoid race
    * conditions: An `etag` is returned in the response to `GetModel`, and
    * systems are expected to put that etag in the request to `UpdateModel` to
    * ensure that their change will be applied to the model as intended.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Optional. One or more labels that you can add, to organize your models.
    * Each label is a key-value pair, where both the key and the value are
    * arbitrary strings that you supply. For more information, see the
    * documentation on &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/resource-labels&quot;&gt;using
    * labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Required. The name specified for the model when it was created.  The
    * model name must be unique within the project it is created in.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. If true, enables logging of stderr and stdout streams for
    * online prediction in Stackdriver Logging. These can be more verbose than
    * the standard access logs (see `online_prediction_logging`) and thus can
    * incur higher cost. However, they are helpful for debugging. Note that
    * since Stackdriver logs may incur a cost, particularly if the total QPS in
    * your project is high, be sure to estimate your costs before enabling this
    * flag.  Default is false.
    */
  var onlinePredictionConsoleLogging: js.UndefOr[Boolean] = js.native
  /**
    * Optional. If true, online prediction access logs are sent to StackDriver
    * Logging. These logs are like standard server access logs, containing
    * information like timestamp and latency for each request. Note that
    * Stackdriver logs may incur a cost, particular if the total QPS in your
    * project is high.  Default is false.
    */
  var onlinePredictionLogging: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The list of regions where the model is going to be deployed.
    * Currently only one region per model is supported. Defaults to
    * &#39;us-central1&#39; if nothing is set. See the &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/regions&quot;&gt;available
    * regions&lt;/a&gt; for ML Engine services. Note: *   No matter where a
    * model is deployed, it can always be accessed by     users from anywhere,
    * both for online and batch prediction. *   The region for a batch
    * prediction job is set by the region field when     submitting the batch
    * prediction job and does not take its value from     this field.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleCloudMlV1Model {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Model]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ModelOps[Self <: SchemaGoogleCloudMlV1Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultVersion(value: SchemaGoogleCloudMlV1Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVersion")(js.undefined)
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
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlinePredictionConsoleLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlinePredictionConsoleLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlinePredictionConsoleLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlinePredictionConsoleLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlinePredictionLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlinePredictionLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlinePredictionLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlinePredictionLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
  }
  
}


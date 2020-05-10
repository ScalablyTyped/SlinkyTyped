package typingsSlinky.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierJsonClassifier extends js.Object {
  /**
    * A `JsonPath` string defining the JSON data for the classifier to classify. AWS Glue supports a subset of `JsonPath`, as described in [Writing JsonPath Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json).
    */
  var jsonPath: String = js.native
}

object ClassifierJsonClassifier {
  @scala.inline
  def apply(jsonPath: String): ClassifierJsonClassifier = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierJsonClassifier]
  }
  @scala.inline
  implicit class ClassifierJsonClassifierOps[Self <: ClassifierJsonClassifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


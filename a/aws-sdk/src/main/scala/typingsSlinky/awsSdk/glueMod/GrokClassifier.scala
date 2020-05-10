package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrokClassifier extends js.Object {
  /**
    * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, and so on.
    */
  var Classification: typingsSlinky.awsSdk.glueMod.Classification = js.native
  /**
    * The time that this classifier was registered.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * Optional custom grok patterns defined by this classifier. For more information, see custom patterns in Writing Custom Classifiers.
    */
  var CustomPatterns: js.UndefOr[typingsSlinky.awsSdk.glueMod.CustomPatterns] = js.native
  /**
    * The grok pattern applied to a data store by this classifier. For more information, see built-in patterns in Writing Custom Classifiers.
    */
  var GrokPattern: typingsSlinky.awsSdk.glueMod.GrokPattern = js.native
  /**
    * The time that this classifier was last updated.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.native
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
  /**
    * The version of this classifier.
    */
  var Version: js.UndefOr[VersionId] = js.native
}

object GrokClassifier {
  @scala.inline
  def apply(Classification: Classification, GrokPattern: GrokPattern, Name: NameString): GrokClassifier = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], GrokPattern = GrokPattern.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrokClassifier]
  }
  @scala.inline
  implicit class GrokClassifierOps[Self <: GrokClassifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassification(value: Classification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrokPattern(value: GrokPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrokPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomPatterns(value: CustomPatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: VersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}


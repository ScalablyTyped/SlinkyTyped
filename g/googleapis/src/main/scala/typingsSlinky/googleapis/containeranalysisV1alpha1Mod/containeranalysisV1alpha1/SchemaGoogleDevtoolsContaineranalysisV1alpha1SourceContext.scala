package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SourceContext is a reference to a tree of files. A SourceContext together
  * with a path point to a unique revision of a single file or directory.
  */
@js.native
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext extends js.Object {
  /**
    * A SourceContext referring to a revision in a Google Cloud Source Repo.
    */
  var cloudRepo: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext] = js.native
  /**
    * A SourceContext referring to a Gerrit project.
    */
  var gerrit: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext] = js.native
  /**
    * A SourceContext referring to any third party Git repo (e.g., GitHub).
    */
  var git: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext] = js.native
  /**
    * Labels with user defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContextOps[Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudRepo(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudRepo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudRepo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudRepo")(js.undefined)
        ret
    }
    @scala.inline
    def withGerrit(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gerrit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGerrit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gerrit")(js.undefined)
        ret
    }
    @scala.inline
    def withGit(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(js.undefined)
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
  }
  
}


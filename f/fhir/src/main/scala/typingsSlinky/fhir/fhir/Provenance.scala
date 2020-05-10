package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who, What, When for a set of resources
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Provenance extends DomainResource {
  /**
    * Contains extended information for property 'policy'.
    */
  var _policy: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'recorded'.
    */
  var _recorded: js.UndefOr[Element] = js.native
  /**
    * Activity that occurred
    */
  var activity: js.UndefOr[Coding] = js.native
  /**
    * Actor involved
    */
  var agent: js.Array[ProvenanceAgent] = js.native
  /**
    * An entity used in this activity
    */
  var entity: js.UndefOr[js.Array[ProvenanceEntity]] = js.native
  /**
    * Where the activity occurred, if relevant
    */
  var location: js.UndefOr[Reference] = js.native
  /**
    * When the activity occurred
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Policy or plan the activity was defined by
    */
  var policy: js.UndefOr[js.Array[uri]] = js.native
  /**
    * Reason the activity is occurring
    */
  var reason: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * When the activity was recorded / updated
    */
  var recorded: instant = js.native
  /**
    * Signature on target
    */
  var signature: js.UndefOr[js.Array[Signature]] = js.native
  /**
    * Target Reference(s) (usually version specific)
    */
  var target: js.Array[Reference] = js.native
}

object Provenance {
  @scala.inline
  def apply(agent: js.Array[ProvenanceAgent], recorded: instant, target: js.Array[Reference]): Provenance = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provenance]
  }
  @scala.inline
  implicit class ProvenanceOps[Self <: Provenance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: js.Array[ProvenanceAgent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecorded(value: instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_policy(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_policy")(js.undefined)
        ret
    }
    @scala.inline
    def with_recorded(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_recorded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_recorded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_recorded")(js.undefined)
        ret
    }
    @scala.inline
    def withActivity(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(js.undefined)
        ret
    }
    @scala.inline
    def withEntity(value: js.Array[ProvenanceEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: js.Array[uri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: js.Array[Coding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: js.Array[Signature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkillsStoreSkill extends StObject {
  
  /**
    * The URL where the skill icon resides.
    */
  var IconUrl: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.IconUrl] = js.native
  
  /**
    * Sample utterances that interact with the skill.
    */
  var SampleUtterances: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SampleUtterances] = js.native
  
  /**
    * Short description about the skill.
    */
  var ShortDescription: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ShortDescription] = js.native
  
  /**
    * Information about the skill.
    */
  var SkillDetails: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillDetails] = js.native
  
  /**
    * The ARN of the skill.
    */
  var SkillId: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillId] = js.native
  
  /**
    * The name of the skill.
    */
  var SkillName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.SkillName] = js.native
  
  /**
    * Linking support for a skill.
    */
  var SupportsLinking: js.UndefOr[scala.Boolean] = js.native
}
object SkillsStoreSkill {
  
  @scala.inline
  def apply(): SkillsStoreSkill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillsStoreSkill]
  }
  
  @scala.inline
  implicit class SkillsStoreSkillMutableBuilder[Self <: SkillsStoreSkill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconUrl(value: IconUrl): Self = StObject.set(x, "IconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "IconUrl", js.undefined)
    
    @scala.inline
    def setSampleUtterances(value: SampleUtterances): Self = StObject.set(x, "SampleUtterances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleUtterancesUndefined: Self = StObject.set(x, "SampleUtterances", js.undefined)
    
    @scala.inline
    def setSampleUtterancesVarargs(value: Utterance*): Self = StObject.set(x, "SampleUtterances", js.Array(value :_*))
    
    @scala.inline
    def setShortDescription(value: ShortDescription): Self = StObject.set(x, "ShortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescriptionUndefined: Self = StObject.set(x, "ShortDescription", js.undefined)
    
    @scala.inline
    def setSkillDetails(value: SkillDetails): Self = StObject.set(x, "SkillDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillDetailsUndefined: Self = StObject.set(x, "SkillDetails", js.undefined)
    
    @scala.inline
    def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillIdUndefined: Self = StObject.set(x, "SkillId", js.undefined)
    
    @scala.inline
    def setSkillName(value: SkillName): Self = StObject.set(x, "SkillName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillNameUndefined: Self = StObject.set(x, "SkillName", js.undefined)
    
    @scala.inline
    def setSupportsLinking(value: scala.Boolean): Self = StObject.set(x, "SupportsLinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsLinkingUndefined: Self = StObject.set(x, "SupportsLinking", js.undefined)
  }
}

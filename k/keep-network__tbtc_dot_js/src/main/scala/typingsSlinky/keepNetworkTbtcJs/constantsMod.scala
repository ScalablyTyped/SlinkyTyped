package typingsSlinky.keepNetworkTbtcJs

import typingsSlinky.keepNetworkTbtcJs.commonTypesMod.Contract
import typingsSlinky.keepNetworkTbtcJs.commonTypesMod.TBTCConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keep-network/tbtc.js/src/Constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  @js.native
  class Constants protected () extends js.Object {
    def this(constants: js.Any, contract: Contract) = this()
    
    var AUCTION_DURATION: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var BENEFICIARY_REWARD_DIVISOR: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var COURTESY_CALL_DURATION: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var DEPOSIT_TERM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var FUNDING_PROOF_TIMEOUT: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var INCREASE_FEE_TIMER: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var MINIMUM_REDEMPTION_FEE: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var PERMITTED_FEE_BUMPS: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var REDEMPTION_PROOF_TIMEOUT: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var REDEMPTION_SIGNATURE_TIMEOUT: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var SATOSHI_MULTIPLIER: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var SIGNING_GROUP_FORMATION_TIMEOUT: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var TX_PROOF_DIFFICULTY_FACTOR: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var contract: Contract = js.native
  }
  /* static members */
  @js.native
  object Constants extends js.Object {
    
    def withConfig(config: TBTCConfig): js.Promise[Constants] = js.native
  }
}

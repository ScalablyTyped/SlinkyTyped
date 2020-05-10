package typingsSlinky.libraCore.mempoolGrpcPbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent grpc.grpc.ServiceDefinition<grpc.grpc.UntypedServiceImplementation> */
@js.native
trait IMempoolService extends js.Object {
  var addTransactionWithValidation: IMempoolServiceIAddTransactionWithValidation = js.native
  var commitTransactions: IMempoolServiceICommitTransactions = js.native
  var getBlock: IMempoolServiceIGetBlock = js.native
  var healthCheck: IMempoolServiceIHealthCheck = js.native
}

object IMempoolService {
  @scala.inline
  def apply(
    addTransactionWithValidation: IMempoolServiceIAddTransactionWithValidation,
    commitTransactions: IMempoolServiceICommitTransactions,
    getBlock: IMempoolServiceIGetBlock,
    healthCheck: IMempoolServiceIHealthCheck
  ): IMempoolService = {
    val __obj = js.Dynamic.literal(addTransactionWithValidation = addTransactionWithValidation.asInstanceOf[js.Any], commitTransactions = commitTransactions.asInstanceOf[js.Any], getBlock = getBlock.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMempoolService]
  }
  @scala.inline
  implicit class IMempoolServiceOps[Self <: IMempoolService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTransactionWithValidation(value: IMempoolServiceIAddTransactionWithValidation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTransactionWithValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitTransactions(value: IMempoolServiceICommitTransactions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTransactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBlock(value: IMempoolServiceIGetBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthCheck(value: IMempoolServiceIHealthCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object iamMod {
  
  @scala.inline
  def assumeRolePolicyForPrincipal(principal: typingsSlinky.pulumiAws.documentsMod.Principal): typingsSlinky.pulumiAws.documentsMod.PolicyDocument = typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("assumeRolePolicyForPrincipal")(principal.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.pulumiAws.documentsMod.PolicyDocument]
  
  @scala.inline
  def getAccountAlias(): js.Promise[typingsSlinky.pulumiAws.getAccountAliasMod.GetAccountAliasResult] = typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getAccountAlias")().asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getAccountAliasMod.GetAccountAliasResult]]
  @scala.inline
  def getAccountAlias(opts: typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typingsSlinky.pulumiAws.getAccountAliasMod.GetAccountAliasResult] = typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getAccountAlias")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getAccountAliasMod.GetAccountAliasResult]]
  
  @scala.inline
  def getGroup(args: typingsSlinky.pulumiAws.iamGetGroupMod.GetGroupArgs): js.Promise[typingsSlinky.pulumiAws.iamGetGroupMod.GetGroupResult] = typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.iamGetGroupMod.GetGroupResult]]
  @scala.inline
  def getGroup(
    args: typingsSlinky.pulumiAws.iamGetGroupMod.GetGroupArgs,
    opts: typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typingsSlinky.pulumiAws.iamGetGroupMod.GetGroupResult] = (typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.iamGetGroupMod.GetGroupResult]]
  
  @scala.inline
  def getInstanceProfile(args: typingsSlinky.pulumiAws.getInstanceProfileMod.GetInstanceProfileArgs): js.Promise[typingsSlinky.pulumiAws.getInstanceProfileMod.GetInstanceProfileResult] = typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceProfile")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getInstanceProfileMod.GetInstanceProfileResult]]
  @scala.inline
  def getInstanceProfile(
    args: typingsSlinky.pulumiAws.getInstanceProfileMod.GetInstanceProfileArgs,
    opts: typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typingsSlinky.pulumiAws.getInstanceProfileMod.GetInstanceProfileResult] = (typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceProfile")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getInstanceProfileMod.GetInstanceProfileResult]]
  
  @scala.inline
  def getPolicy(args: typingsSlinky.pulumiAws.getPolicyMod.GetPolicyArgs): js.Promise[typingsSlinky.pulumiAws.getPolicyMod.GetPolicyResult] = typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPolicy")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getPolicyMod.GetPolicyResult]]
  @scala.inline
  def getPolicy(
    args: typingsSlinky.pulumiAws.getPolicyMod.GetPolicyArgs,
    opts: typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typingsSlinky.pulumiAws.getPolicyMod.GetPolicyResult] = (typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPolicy")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getPolicyMod.GetPolicyResult]]
  
  @scala.inline
  def getPolicyDocument(): js.Promise[typingsSlinky.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult] = typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPolicyDocument")().asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult]]
  @scala.inline
  def getPolicyDocument(args: js.UndefOr[scala.Nothing], opts: typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typingsSlinky.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult] = (typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPolicyDocument")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult]]
  @scala.inline
  def getPolicyDocument(args: typingsSlinky.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentArgs): js.Promise[typingsSlinky.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult] = typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPolicyDocument")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult]]
  @scala.inline
  def getPolicyDocument(
    args: typingsSlinky.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentArgs,
    opts: typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typingsSlinky.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult] = (typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPolicyDocument")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult]]
  
  @scala.inline
  def getRole(args: typingsSlinky.pulumiAws.getRoleMod.GetRoleArgs): js.Promise[typingsSlinky.pulumiAws.getRoleMod.GetRoleResult] = typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getRole")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getRoleMod.GetRoleResult]]
  @scala.inline
  def getRole(
    args: typingsSlinky.pulumiAws.getRoleMod.GetRoleArgs,
    opts: typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typingsSlinky.pulumiAws.getRoleMod.GetRoleResult] = (typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getRole")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getRoleMod.GetRoleResult]]
  
  @scala.inline
  def getServerCertificate(): js.Promise[typingsSlinky.pulumiAws.getServerCertificateMod.GetServerCertificateResult] = typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getServerCertificate")().asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getServerCertificateMod.GetServerCertificateResult]]
  @scala.inline
  def getServerCertificate(args: js.UndefOr[scala.Nothing], opts: typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typingsSlinky.pulumiAws.getServerCertificateMod.GetServerCertificateResult] = (typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getServerCertificate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getServerCertificateMod.GetServerCertificateResult]]
  @scala.inline
  def getServerCertificate(args: typingsSlinky.pulumiAws.getServerCertificateMod.GetServerCertificateArgs): js.Promise[typingsSlinky.pulumiAws.getServerCertificateMod.GetServerCertificateResult] = typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getServerCertificate")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getServerCertificateMod.GetServerCertificateResult]]
  @scala.inline
  def getServerCertificate(
    args: typingsSlinky.pulumiAws.getServerCertificateMod.GetServerCertificateArgs,
    opts: typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typingsSlinky.pulumiAws.getServerCertificateMod.GetServerCertificateResult] = (typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getServerCertificate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getServerCertificateMod.GetServerCertificateResult]]
  
  @scala.inline
  def getUser(args: typingsSlinky.pulumiAws.getUserMod.GetUserArgs): js.Promise[typingsSlinky.pulumiAws.getUserMod.GetUserResult] = typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getUserMod.GetUserResult]]
  @scala.inline
  def getUser(
    args: typingsSlinky.pulumiAws.getUserMod.GetUserArgs,
    opts: typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typingsSlinky.pulumiAws.getUserMod.GetUserResult] = (typingsSlinky.pulumiAws.iamMod.^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.pulumiAws.getUserMod.GetUserResult]]
}

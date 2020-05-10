package typingsSlinky.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRandomPasswordRequest extends js.Object {
  /**
    * A string that includes characters that should not be included in the generated password. The default is that all characters from the included sets can be used.
    */
  var ExcludeCharacters: js.UndefOr[ExcludeCharactersType] = js.native
  /**
    * Specifies that the generated password should not include lowercase letters. The default if you do not include this switch parameter is that lowercase letters can be included.
    */
  var ExcludeLowercase: js.UndefOr[ExcludeLowercaseType] = js.native
  /**
    * Specifies that the generated password should not include digits. The default if you do not include this switch parameter is that digits can be included.
    */
  var ExcludeNumbers: js.UndefOr[ExcludeNumbersType] = js.native
  /**
    * Specifies that the generated password should not include punctuation characters. The default if you do not include this switch parameter is that punctuation characters can be included. The following are the punctuation characters that can be included in the generated password if you don't explicitly exclude them with ExcludeCharacters or ExcludePunctuation:  ! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~ 
    */
  var ExcludePunctuation: js.UndefOr[ExcludePunctuationType] = js.native
  /**
    * Specifies that the generated password should not include uppercase letters. The default if you do not include this switch parameter is that uppercase letters can be included.
    */
  var ExcludeUppercase: js.UndefOr[ExcludeUppercaseType] = js.native
  /**
    * Specifies that the generated password can include the space character. The default if you do not include this switch parameter is that the space character is not included.
    */
  var IncludeSpace: js.UndefOr[IncludeSpaceType] = js.native
  /**
    * The desired length of the generated password. The default value if you do not include this parameter is 32 characters.
    */
  var PasswordLength: js.UndefOr[PasswordLengthType] = js.native
  /**
    * A boolean value that specifies whether the generated password must include at least one of every allowed character type. The default value is True and the operation requires at least one of every character type.
    */
  var RequireEachIncludedType: js.UndefOr[RequireEachIncludedTypeType] = js.native
}

object GetRandomPasswordRequest {
  @scala.inline
  def apply(): GetRandomPasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRandomPasswordRequest]
  }
  @scala.inline
  implicit class GetRandomPasswordRequestOps[Self <: GetRandomPasswordRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeCharacters(value: ExcludeCharactersType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeLowercase(value: ExcludeLowercaseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeLowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeLowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeLowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeNumbers(value: ExcludeNumbersType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludePunctuation(value: ExcludePunctuationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludePunctuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludePunctuation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludePunctuation")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeUppercase(value: ExcludeUppercaseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeUppercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeUppercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeUppercase")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSpace(value: IncludeSpaceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordLength(value: PasswordLengthType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordLength")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireEachIncludedType(value: RequireEachIncludedTypeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireEachIncludedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireEachIncludedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireEachIncludedType")(js.undefined)
        ret
    }
  }
  
}


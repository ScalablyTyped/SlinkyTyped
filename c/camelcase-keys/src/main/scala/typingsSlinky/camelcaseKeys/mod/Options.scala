package typingsSlinky.camelcaseKeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Recurse nested objects and objects in arrays.
  		@default false
  		*/
  val deep: js.UndefOr[Boolean] = js.native
  /**
  		Exclude keys from being camel-cased.
  		@default []
  		*/
  val exclude: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  /**
  		Uppercase the first character as in `bye-bye` → `ByeBye`.
  		@default false
  		*/
  val pascalCase: js.UndefOr[Boolean] = js.native
  /**
  		Exclude children at the given object paths in dot-notation from being camel-cased. For example, with an object like `{a: {b: '🦄'}}`, the object path to reach the unicorn is `'a.b'`.
  		@default []
  		@example
  		```
  		camelcaseKeys({
  			a_b: 1,
  			a_c: {
  				c_d: 1,
  				c_e: {
  					e_f: 1
  				}
  			}
  		}, {
  			deep: true,
  			stopPaths: [
  				'a_c.c_e'
  			]
  		}),
  		// {
  		// 	aB: 1,
  		// 	aC: {
  		// 		cD: 1,
  		// 		cE: {
  		// 			e_f: 1
  		// 		}
  		// 	}
  		// }
  		```
  		*/
  val stopPaths: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withPascalCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pascalCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPascalCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pascalCase")(js.undefined)
        ret
    }
    @scala.inline
    def withStopPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPaths")(js.undefined)
        ret
    }
  }
  
}


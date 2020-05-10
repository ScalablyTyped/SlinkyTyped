package typingsSlinky.onChange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		The function receives two arguments to be compared for equality. Should return `true` if the two values are determined to be equal.
  		@default Object.is
  		@example
  		 ```
  		import onChange = require('on-change');
  		const object = {
  			a: {
  				b: false
  			}
  		};
  		let i = 0;
  		const watchedObject = onChange(object, () => {
  			console.log('Object changed:', ++i);
  		}, {equals: (a, b) => a === b});
  		watchedObject.a.b = 0;
  		// Nothing happens
  		watchedObject.a = true;
  		//=> 'Object changed: 1'
  		```
  		*/
  @JSName("equals")
  var equals_FOptions: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]] = js.native
  /**
  		Setting properties in this array won't trigger the callback.
  		@default undefined
  		*/
  var ignoreKeys: js.UndefOr[js.Array[String | js.Symbol]] = js.native
  /**
  		Setting properties as `Symbol` won't trigger the callback.
  		@default false
  		*/
  var ignoreSymbols: js.UndefOr[Boolean] = js.native
  /**
  		Setting properties with an underscore as the first character won't trigger the callback.
  		@default false
  		*/
  var ignoreUnderscores: js.UndefOr[Boolean] = js.native
  /**
  		Deep changes will not trigger the callback. Only changes to the immediate properties of the original object.
  		@default false
  		@example
  		```
  		import onChange = require('on-change');
  		const object = {
  			a: {
  				b: false
  			}
  		};
  		let i = 0;
  		const watchedObject = onChange(object, () => {
  			console.log('Object changed:', ++i);
  		}, {isShallow: true});
  		watchedObject.a.b = true;
  		// Nothing happens
  		watchedObject.a = true;
  		//=> 'Object changed: 1'
  		```
  		*/
  var isShallow: js.UndefOr[Boolean] = js.native
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
    def withEquals(value: (/* a */ js.Any, /* b */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreKeys(value: js.Array[String | js.Symbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSymbols(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSymbols")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnderscores(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnderscores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnderscores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnderscores")(js.undefined)
        ret
    }
    @scala.inline
    def withIsShallow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShallow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsShallow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShallow")(js.undefined)
        ret
    }
  }
  
}


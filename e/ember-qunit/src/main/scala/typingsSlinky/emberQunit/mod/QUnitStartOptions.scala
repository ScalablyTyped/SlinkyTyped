package typingsSlinky.emberQunit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QUnitStartOptions extends js.Object {
  /**
    * If `false` tests will not be loaded automatically.
    */
  var loadTests: js.UndefOr[Boolean] = js.native
  /**
    * If `false` validation of `Ember.onerror` will be disabled.
    */
  var setupEmberOnerrorValidation: js.UndefOr[Boolean] = js.native
  /**
    * `false` opts out of the default behavior of setting `Ember.testing`
    * to `true` before all tests and back to `false` after each test will.
    */
  var setupEmberTesting: js.UndefOr[Boolean] = js.native
  /**
    * If `false` the default Ember.Test adapter will not be updated.
    */
  var setupTestAdapter: js.UndefOr[Boolean] = js.native
  /**
    * If `false` the test container will not be setup based on `devmode`,
    * `dockcontainer`, or `nocontainer` URL params.
    */
  var setupTestContainer: js.UndefOr[Boolean] = js.native
  /**
    * If `false` test isolation validation will be disabled.
    */
  var setupTestIsolationValidation: js.UndefOr[Boolean] = js.native
  /**
    * If `false` tests will not be automatically started (you must run
    * `QUnit.start()` to kick them off).
    */
  var startTests: js.UndefOr[Boolean] = js.native
}

object QUnitStartOptions {
  @scala.inline
  def apply(): QUnitStartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QUnitStartOptions]
  }
  @scala.inline
  implicit class QUnitStartOptionsOps[Self <: QUnitStartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadTests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadTests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTests")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupEmberOnerrorValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupEmberOnerrorValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupEmberOnerrorValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupEmberOnerrorValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupEmberTesting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupEmberTesting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupEmberTesting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupEmberTesting")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupTestAdapter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupTestAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupTestAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupTestAdapter")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupTestContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupTestContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupTestContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupTestContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupTestIsolationValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupTestIsolationValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupTestIsolationValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupTestIsolationValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTests")(js.undefined)
        ret
    }
  }
  
}


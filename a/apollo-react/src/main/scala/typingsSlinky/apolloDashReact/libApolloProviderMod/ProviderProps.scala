package typingsSlinky.apolloDashReact.libApolloProviderMod

import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps extends js.Object {
  var client: typingsSlinky.apolloDashClient.apolloDashClientMod.default[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
  ]
  var immutable: js.UndefOr[Boolean] = js.undefined
  var store: js.UndefOr[Store[_, AnyAction]] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply(
    client: typingsSlinky.apolloDashClient.apolloDashClientMod.default[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
    ],
    immutable: js.UndefOr[Boolean] = js.undefined,
    store: Store[_, AnyAction] = null
  ): ProviderProps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps]
  }
}


organization := "org.scalablytyped.slinky"
name := "material-components-web"
version := "4.0.0-f20d0f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "material__auto-init" % "0.35-dt-20190213Z-ce07e3",
  "org.scalablytyped.slinky" %%% "material__base" % "0.35-dt-20191126Z-80ccb3",
  "org.scalablytyped.slinky" %%% "material__checkbox" % "0.35-dt-20191126Z-412db5",
  "org.scalablytyped.slinky" %%% "material__chips" % "0.35-dt-20191126Z-d57dd4",
  "org.scalablytyped.slinky" %%% "material__data-table" % "4.0.0-c85e84",
  "org.scalablytyped.slinky" %%% "material__dialog" % "0.35-dt-20191126Z-502ade",
  "org.scalablytyped.slinky" %%% "material__drawer" % "0.43-dt-20191126Z-8c0854",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "0.35-dt-20191126Z-86c1e6",
  "org.scalablytyped.slinky" %%% "material__form-field" % "0.35-dt-20191126Z-403e45",
  "org.scalablytyped.slinky" %%% "material__grid-list" % "0.35-dt-20191126Z-b0d196",
  "org.scalablytyped.slinky" %%% "material__icon-button" % "4.0.0-201427",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "0.35-dt-20191126Z-15774f",
  "org.scalablytyped.slinky" %%% "material__linear-progress" % "0.35-dt-20191126Z-d83247",
  "org.scalablytyped.slinky" %%% "material__list" % "0.43-dt-20191126Z-77871a",
  "org.scalablytyped.slinky" %%% "material__menu" % "0.35-dt-20191126Z-b44d5f",
  "org.scalablytyped.slinky" %%% "material__menu-surface" % "4.0.0-72603e",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "0.35-dt-20191126Z-a6c773",
  "org.scalablytyped.slinky" %%% "material__radio" % "0.35-dt-20191126Z-c32ba0",
  "org.scalablytyped.slinky" %%% "material__ripple" % "0.35-dt-20191126Z-ef7835",
  "org.scalablytyped.slinky" %%% "material__select" % "0.35-dt-20191126Z-118c1c",
  "org.scalablytyped.slinky" %%% "material__selection-control" % "0.35-dt-20190213Z-5fa5c2",
  "org.scalablytyped.slinky" %%% "material__slider" % "0.35-dt-20191126Z-2b74b1",
  "org.scalablytyped.slinky" %%% "material__snackbar" % "0.35-dt-20191126Z-8b2e9d",
  "org.scalablytyped.slinky" %%% "material__switch" % "4.0.0-edd841",
  "org.scalablytyped.slinky" %%% "material__tab" % "0.35-dt-20191126Z-ec5da4",
  "org.scalablytyped.slinky" %%% "material__tab-bar" % "4.0.0-94ec67",
  "org.scalablytyped.slinky" %%% "material__tab-indicator" % "4.0.0-733305",
  "org.scalablytyped.slinky" %%% "material__tab-scroller" % "4.0.0-646f39",
  "org.scalablytyped.slinky" %%% "material__textfield" % "0.35-dt-20191126Z-72eb4c",
  "org.scalablytyped.slinky" %%% "material__top-app-bar" % "0.35-dt-20191126Z-e4dcb2",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")

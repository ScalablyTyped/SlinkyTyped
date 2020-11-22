organization := "org.scalablytyped.slinky"
name := "react-instantsearch"
version := "6.3-dt-20200515Z-6787eb"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "algolia__cache-common" % "4.8.0-dd8654",
  "org.scalablytyped.slinky" %%% "algolia__client-analytics" % "4.8.0-94b626",
  "org.scalablytyped.slinky" %%% "algolia__client-common" % "4.8.0-e2adf1",
  "org.scalablytyped.slinky" %%% "algolia__client-recommendation" % "4.8.0-024a11",
  "org.scalablytyped.slinky" %%% "algolia__client-search" % "4.8.0-309681",
  "org.scalablytyped.slinky" %%% "algolia__logger-common" % "4.8.0-02383a",
  "org.scalablytyped.slinky" %%% "algolia__requester-common" % "4.8.0-60350d",
  "org.scalablytyped.slinky" %%% "algolia__transporter" % "4.8.0-6e55a0",
  "org.scalablytyped.slinky" %%% "algoliasearch" % "4.8.0-749ef4",
  "org.scalablytyped.slinky" %%% "algoliasearch-helper" % "3.3.2-2fcbbc",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "events" % "3.0-dt-20200515Z-c0f47b",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "react-instantsearch-core" % "6.3-dt-20200911Z-fc64b2",
  "org.scalablytyped.slinky" %%% "react-instantsearch-dom" % "6.3-dt-20200515Z-58b0dd",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

organization := "org.scalablytyped.slinky"
name := "algoliasearch"
version := "4.8.0-749ef4"
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
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

organization := "org.scalablytyped.slinky"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20190730Z-41ca31"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-8944d8",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-13a419",
  "org.scalablytyped.slinky" %%% "redux-first-router" % "2.1-dt-20200515Z-b720c9",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

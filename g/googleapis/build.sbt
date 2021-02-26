organization := "org.scalablytyped.slinky"
name := "googleapis"
version := "39.2.0-3489dc"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "gaxios" % "4.0.1-b7ad40",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "6.1.3-d0c57d",
  "org.scalablytyped.slinky" %%% "googleapis-common" % "0.7.2-54830d",
  "org.scalablytyped.slinky" %%% "gtoken" % "5.1.0-039104",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
